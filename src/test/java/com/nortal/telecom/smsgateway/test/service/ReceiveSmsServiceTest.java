package com.nortal.telecom.smsgateway.test.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nortal.telecom.smsgateway.model.receivesms.SmsMessage;
import com.nortal.telecom.smsgateway.service.ReceiveSmsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:testApplicationContext.xml" })
public class ReceiveSmsServiceTest {

	@Resource
	private ReceiveSmsService service;

	// @Ignore
	@Test
	public void getReceivedSmsTest() {
		List<SmsMessage> messages = service.getReceivedSms();
		assertEquals(0, messages.size());
	}
}
