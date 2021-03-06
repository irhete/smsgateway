package com.nortal.telecom.smsgateway.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.SoapFaultClientException;

import com.nortal.telecom.smsgateway.error.SoapResponseErrorMessageHandler;
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

	private static final Logger log = LoggerFactory
			.getLogger(SendSmsServiceImpl.class);

	private static final String SENDER_NAME = "sender:9498";

	private static final ObjectFactory SEND_SMS_FACTORY = new ObjectFactory();

	@Resource(name = "sendSmsWebServiceTemplate")
	private WebServiceTemplate sendSmsWebServiceTemplate;

	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		sendSmsWebServiceTemplate = webServiceTemplate;
	}

	public WebServiceTemplate getWebServiceTemplate() {
		return sendSmsWebServiceTemplate;
	}

	public SendSmsResponse sendSms(String message, List<String> addresses,
			ChargingInformation chargingInfo) {
		log.debug("Building sms request");
		SendSms request = SEND_SMS_FACTORY.createSendSms();
		request.setMessage(message);
		request.setSenderName(SENDER_NAME);
		request.setCharging(chargingInfo);
		for (String address : addresses) {
			request.getAddresses().add(address);
		}
		return sendSmsAndHandleResponse(request);

	}

	private SendSmsResponse sendSmsAndHandleResponse(SendSms request)
			throws RuntimeException {
		try {
			log.debug("Sending sms");
			SendSmsResponse response = (SendSmsResponse) sendSmsWebServiceTemplate
					.marshalSendAndReceive(request);
			log.debug("Handling sent sms response");
			if (response.getResult().indexOf("SVC") != -1) {
				throw SoapResponseErrorMessageHandler.handle(response
						.getResult());
			}
			return response;
		} catch (SoapFaultClientException e) {
			throw SoapResponseErrorMessageHandler.handle(e);
		}

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
