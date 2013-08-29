package com.nortal.telecom.smsgateway.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.nortal.telecom.smsgateway.model.sendsms.ChargingInformation;
import com.nortal.telecom.smsgateway.model.sendsms.GetReceivedReport;
import com.nortal.telecom.smsgateway.model.sendsms.GetReceivedReportResponse;
import com.nortal.telecom.smsgateway.model.sendsms.GetSmsDeliveryStatus;
import com.nortal.telecom.smsgateway.model.sendsms.GetSmsDeliveryStatusResponse;
import com.nortal.telecom.smsgateway.model.sendsms.ObjectFactory;
import com.nortal.telecom.smsgateway.model.sendsms.SendSms;
import com.nortal.telecom.smsgateway.model.sendsms.SendSmsLogo;
import com.nortal.telecom.smsgateway.model.sendsms.SendSmsLogoResponse;
import com.nortal.telecom.smsgateway.model.sendsms.SendSmsResponse;
import com.nortal.telecom.smsgateway.model.sendsms.SendSmsRingtone;
import com.nortal.telecom.smsgateway.model.sendsms.SendSmsRingtoneResponse;
import com.nortal.telecom.smsgateway.model.sendsms.SendUnicodeSms;
import com.nortal.telecom.smsgateway.model.sendsms.SendUnicodeSmsResponse;
import com.nortal.telecom.smsgateway.model.sendsms.SendUnicodeSmsWithReport;
import com.nortal.telecom.smsgateway.model.sendsms.SendUnicodeSmsWithReportResponse;

@Service
public class SendSmsServiceImpl implements SendSmsService {

	private static final String SENDER_NAME = "sender:9498";

	private static final ObjectFactory SEND_SMS_FACTORY = new ObjectFactory();

	@Resource(name = "sendSmsWebServiceTemplate")
	private WebServiceTemplate sendSmsWebServiceTemplate;

	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		sendSmsWebServiceTemplate = webServiceTemplate;
	}

	public SendSmsResponse sendSms(String message, List<String> addresses,
			ChargingInformation chargingInfo) {
		SendSms request = SEND_SMS_FACTORY.createSendSms();
		request.setMessage(message);
		request.setSenderName(SENDER_NAME);
		request.setCharging(chargingInfo);
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

	public SendSmsLogoResponse sendSmsLogo(SendSmsLogo request) {
		// TODO Auto-generated method stub
		return null;
	}

	public SendSmsRingtoneResponse sendSmsRingtone(SendSmsRingtone request) {
		// TODO Auto-generated method stub
		return null;
	}

}
