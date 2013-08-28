package com.nortal.telecom.smsgateway.test.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nortal.telecom.smsgateway.model.receivesms.SmsMessage;
import com.nortal.telecom.smsgateway.service.ReceiveSmsService;

public class ReceiveSmsServiceTest {

	@Autowired
	private ReceiveSmsService service;

	@Ignore
	@Test
	public void getReceivedSmsTest() {
		List<SmsMessage> messages = service.getReceivedSms();
		assertEquals(1, messages.size());
	}
}
