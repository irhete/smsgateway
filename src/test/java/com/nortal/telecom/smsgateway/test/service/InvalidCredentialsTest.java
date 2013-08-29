package com.nortal.telecom.smsgateway.test.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nortal.telecom.smsgateway.error.exception.InvalidCredentialsException;
import com.nortal.telecom.smsgateway.model.sendsms.ChargingInformation;
import com.nortal.telecom.smsgateway.service.SendSmsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:testApplicationContextInvalidCredentials.xml" })
public class InvalidCredentialsTest {

	@Resource
	private SendSmsService service;

	@Test(expected = InvalidCredentialsException.class)
	public void invalidPasswordTest() {
		String message = "TestMessage";
		List<String> addresses = new ArrayList<String>();
		addresses.add("receiver:55906207");
		service.sendSms(message, addresses, new ChargingInformation());
	}
}
