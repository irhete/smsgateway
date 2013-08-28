package com.nortal.telecom.smsgateway.service.sendsms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.nortal.telecom.smsgateway.model.sendsms.ChargingInformation;
import com.nortal.telecom.smsgateway.model.sendsms.GetReceivedReport;
import com.nortal.telecom.smsgateway.model.sendsms.GetReceivedReportResponse;
import com.nortal.telecom.smsgateway.model.sendsms.GetSmsDeliveryStatus;
import com.nortal.telecom.smsgateway.model.sendsms.GetSmsDeliveryStatusResponse;
import com.nortal.telecom.smsgateway.model.sendsms.ObjectFactory;
import com.nortal.telecom.smsgateway.model.sendsms.SendSms;
import com.nortal.telecom.smsgateway.model.sendsms.SendSmsResponse;
import com.nortal.telecom.smsgateway.model.sendsms.SendUnicodeSms;
import com.nortal.telecom.smsgateway.model.sendsms.SendUnicodeSmsResponse;
import com.nortal.telecom.smsgateway.model.sendsms.SendUnicodeSmsWithReport;
import com.nortal.telecom.smsgateway.model.sendsms.SendUnicodeSmsWithReportResponse;

public class SendSmsServiceImpl implements SendSmsService {

	private String SENDER_NAME = "sender";

	@Autowired
	private WebServiceTemplate sendSmsWebServiceTemplate;

	private String soapAction;

	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		sendSmsWebServiceTemplate = webServiceTemplate;
	}

	public void setSoapAction(String soapAction) {
		this.soapAction = soapAction;
	}

	public SendSmsResponse sendSms(String message, List<String> addresses) {
		setSoapAction("sendSms");
		SendSms request = new ObjectFactory().createSendSms();
		request.setMessage(message);
		request.setCharging(new ChargingInformation());
		request.setSenderName(SENDER_NAME);
		SoapActionCallback sac = new SoapActionCallback(soapAction);

		SendSmsResponse response = (SendSmsResponse) sendSmsWebServiceTemplate
				.marshalSendAndReceive(request, sac);

		return response;
	}

	public SendUnicodeSmsResponse sendUnicodeSms(SendUnicodeSms request) {
		// TODO Auto-generated method stub
		return null;
	}

	public SendUnicodeSmsWithReportResponse sendSmsWithReport(
			SendUnicodeSmsWithReport request) {
		// TODO Auto-generated method stub
		return null;
	}

	public SendUnicodeSmsWithReportResponse sendUnicodeSmsWithReport(
			SendUnicodeSmsWithReport request) {
		// TODO Auto-generated method stub
		return null;
	}

	public GetSmsDeliveryStatusResponse getSmsDeliveryStatus(
			GetSmsDeliveryStatus request) {
		// TODO Auto-generated method stub
		return null;
	}

	public GetReceivedReportResponse getReceivedReport(GetReceivedReport request) {
		// TODO Auto-generated method stub
		return null;
	}

}
