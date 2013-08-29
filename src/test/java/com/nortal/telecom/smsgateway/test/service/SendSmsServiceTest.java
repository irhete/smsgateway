package com.nortal.telecom.smsgateway.test.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nortal.telecom.smsgateway.error.exception.MessageExceedsMaximumLengthException;
import com.nortal.telecom.smsgateway.error.exception.ReceiverFormatException;
import com.nortal.telecom.smsgateway.model.sendsms.ChargingInformation;
import com.nortal.telecom.smsgateway.model.sendsms.SendSmsResponse;
import com.nortal.telecom.smsgateway.service.SendSmsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:testApplicationContext.xml" })
public class SendSmsServiceTest {

	@Resource
	private SendSmsService service;

	@Ignore
	@Test
	public void sendSmsTest() {
		String message = "TestMessage";
		List<String> addresses = new ArrayList<String>();
		addresses.add("receiver:55906207");
		SendSmsResponse response = service.sendSms(message, addresses,
				new ChargingInformation());
		assertNotNull(response);
	}

	@Test(expected = ReceiverFormatException.class)
	public void sendSmsWrongReceiverFormatTest() {
		String message = "TestMessage";
		List<String> addresses = new ArrayList<String>();
		addresses.add("55906207");
		service.sendSms(message, addresses, new ChargingInformation());
	}

	@Test(expected = MessageExceedsMaximumLengthException.class)
	public void sendSmsMaximumLengthExceededTest() {
		String message = "TestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessageTestMessage";
		List<String> addresses = new ArrayList<String>();
		addresses.add("receiver:55906207");
		service.sendSms(message, addresses, new ChargingInformation());
	}

}
