package com.nortal.telecom.smsgateway.service;

import java.util.List;

import com.nortal.telecom.smsgateway.model.receivesms.SmsMessage;

/**
 * Services for handling received SMS messages
 * 
 */
public interface ReceiveSmsService {

	/**
	 * Retrieves all SMS messages which are sent to the customer since last
	 * request
	 * 
	 * @return List of received SMS messages
	 */
	public List<SmsMessage> getReceivedSms();
}
