package com.nortal.telecom.smsgateway.service;

import java.util.List;

import com.nortal.telecom.smsgateway.model.sendsms.GetReceivedReport;
import com.nortal.telecom.smsgateway.model.sendsms.GetReceivedReportResponse;
import com.nortal.telecom.smsgateway.model.sendsms.GetSmsDeliveryStatus;
import com.nortal.telecom.smsgateway.model.sendsms.GetSmsDeliveryStatusResponse;
import com.nortal.telecom.smsgateway.model.sendsms.SendSmsResponse;
import com.nortal.telecom.smsgateway.model.sendsms.SendUnicodeSms;
import com.nortal.telecom.smsgateway.model.sendsms.SendUnicodeSmsResponse;
import com.nortal.telecom.smsgateway.model.sendsms.SendUnicodeSmsWithReport;
import com.nortal.telecom.smsgateway.model.sendsms.SendUnicodeSmsWithReportResponse;

public interface SendSmsService {

	public SendSmsResponse sendSms(String message, List<String> addresses);

	public SendUnicodeSmsResponse sendUnicodeSms(SendUnicodeSms request);

	public SendUnicodeSmsWithReportResponse sendSmsWithReport(
			SendUnicodeSmsWithReport request);

	public SendUnicodeSmsWithReportResponse sendUnicodeSmsWithReport(
			SendUnicodeSmsWithReport request);

	public GetSmsDeliveryStatusResponse getSmsDeliveryStatus(
			GetSmsDeliveryStatus request);

	public GetReceivedReportResponse getReceivedReport(GetReceivedReport request);

}
