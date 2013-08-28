package com.nortal.telecom.smsgateway.service.receivesms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.nortal.telecom.smsgateway.model.receivesms.GetReceivedSms;
import com.nortal.telecom.smsgateway.model.receivesms.GetReceivedSmsResponse;
import com.nortal.telecom.smsgateway.model.receivesms.ObjectFactory;

@Service
public class ReceiveSmsServiceImpl implements ReceiveSmsService {

	private String REGISTRATION_ID = "id";

	@Autowired
	private WebServiceTemplate receiveWebServiceTemplate;

	private String soapAction;

	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		receiveWebServiceTemplate = webServiceTemplate;
	}

	public void setSoapAction(String soapAction) {
		this.soapAction = soapAction;
	}

	public GetReceivedSmsResponse getReceivedSms() {
		setSoapAction("getReceivedSms");
		GetReceivedSms request = new ObjectFactory().createGetReceivedSms();
		request.setRegistrationIdentifier(REGISTRATION_ID);
		SoapActionCallback sac = new SoapActionCallback(soapAction);

		GetReceivedSmsResponse response = (GetReceivedSmsResponse) receiveWebServiceTemplate
				.marshalSendAndReceive(request, sac);

		return response;
	}

}
