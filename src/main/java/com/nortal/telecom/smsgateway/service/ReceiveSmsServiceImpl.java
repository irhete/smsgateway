package com.nortal.telecom.smsgateway.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.SoapFaultClientException;

import com.nortal.telecom.smsgateway.error.SoapResponseErrorMessageHandler;
import com.nortal.telecom.smsgateway.model.receivesms.GetReceivedSms;
import com.nortal.telecom.smsgateway.model.receivesms.GetReceivedSmsResponse;
import com.nortal.telecom.smsgateway.model.receivesms.ObjectFactory;
import com.nortal.telecom.smsgateway.model.receivesms.SmsMessage;

@Service("receiveSmsService")
public class ReceiveSmsServiceImpl implements ReceiveSmsService {

	private static final Logger log = LoggerFactory
			.getLogger(ReceiveSmsServiceImpl.class);

	private static final String REGISTRATION_ID = "id";

	private static final ObjectFactory RECEIVE_SMS_FACTORY = new ObjectFactory();

	@Resource(name = "receiveSmsWebServiceTemplate")
	private WebServiceTemplate receiveSmsWebServiceTemplate;

	public void setReceiveSmsWebServiceTemplate(
			WebServiceTemplate webServiceTemplate) {
		receiveSmsWebServiceTemplate = webServiceTemplate;
	}

	public List<SmsMessage> getReceivedSms() {
		log.debug("Building receive sms request");
		GetReceivedSms request = RECEIVE_SMS_FACTORY.createGetReceivedSms();
		request.setRegistrationIdentifier(REGISTRATION_ID);
		log.debug("Sending receive sms request");
		GetReceivedSmsResponse response = sendRequestAndHandleResponse(request);
		return response.getResult();
	}

	private GetReceivedSmsResponse sendRequestAndHandleResponse(
			GetReceivedSms request) throws RuntimeException {
		try {
			log.debug("Sending get sms request");
			GetReceivedSmsResponse response = (GetReceivedSmsResponse) receiveSmsWebServiceTemplate
					.marshalSendAndReceive(request);
			log.debug("Handling get sms response");
			return response;
		} catch (SoapFaultClientException e) {
			throw SoapResponseErrorMessageHandler.handle(e);
		}

	}

}
