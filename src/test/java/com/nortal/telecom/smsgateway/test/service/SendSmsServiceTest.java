package com.nortal.telecom.smsgateway.test.service;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nortal.telecom.smsgateway.model.sendsms.ChargingInformation;
import com.nortal.telecom.smsgateway.model.sendsms.SendSmsResponse;
import com.nortal.telecom.smsgateway.service.SendSmsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:testApplicationContext.xml" })
public class SendSmsServiceTest {

	@Resource
	private SendSmsService service;

	@Test
	public void sendSmsTest() {
		String message = "TestMessage";
		List<String> addresses = new ArrayList<String>();
		addresses.add("receiver:55906207");
		SendSmsResponse response = service.sendSms(message, addresses,
				new ChargingInformation());
		assertNotNull(response);
	}

}
