package com.nortal.telecom.smsgateway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private WebServiceTemplate receiveWebServiceTemplate;

	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		receiveWebServiceTemplate = webServiceTemplate;
	}

	public List<SmsMessage> getReceivedSms() {
		GetReceivedSms request = RECEIVE_SMS_FACTORY.createGetReceivedSms();
		request.setRegistrationIdentifier(REGISTRATION_ID);
		GetReceivedSmsResponse response = (GetReceivedSmsResponse) receiveWebServiceTemplate
				.marshalSendAndReceive(request);

		return response.getResult();
	}

}
