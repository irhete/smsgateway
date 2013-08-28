package com.nortal.telecom.smsgateway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.WebServiceTemplate;

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

	private static final String SENDER_NAME = "sender";

	private static final ObjectFactory SEND_SMS_FACTORY = new ObjectFactory();

	@Autowired
	private WebServiceTemplate sendSmsWebServiceTemplate;

	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		sendSmsWebServiceTemplate = webServiceTemplate;
	}

	public SendSmsResponse sendSms(String message, List<String> addresses) {
		SendSms request = SEND_SMS_FACTORY.createSendSms();
		request.setMessage(message);
		request.setCharging(new ChargingInformation());
		request.setSenderName(SENDER_NAME);
		// TODO add setAddresses method to SendSms

		SendSmsResponse response = (SendSmsResponse) sendSmsWebServiceTemplate
				.marshalSendAndReceive(request);
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
