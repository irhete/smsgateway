package com.nortal.telecom.smsgateway.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.nortal.telecom.smsgateway.model.receivesms.GetReceivedSms;
import com.nortal.telecom.smsgateway.model.receivesms.GetReceivedSmsResponse;
import com.nortal.telecom.smsgateway.model.receivesms.ObjectFactory;
import com.nortal.telecom.smsgateway.model.receivesms.SmsMessage;

@Service
public class ReceiveSmsServiceImpl implements ReceiveSmsService {

	private static final String REGISTRATION_ID = "id";

	private static final ObjectFactory RECEIVE_SMS_FACTORY = new ObjectFactory();

	@Resource(name = "receiveSmsWebServiceTemplate")
	private WebServiceTemplate receiveSmsWebServiceTemplate;

	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		receiveSmsWebServiceTemplate = webServiceTemplate;
	}

	public List<SmsMessage> getReceivedSms() {
		GetReceivedSms request = RECEIVE_SMS_FACTORY.createGetReceivedSms();
		request.setRegistrationIdentifier(REGISTRATION_ID);
		GetReceivedSmsResponse response = (GetReceivedSmsResponse) receiveSmsWebServiceTemplate
				.marshalSendAndReceive(request);

		return response.getResult();
	}

}
