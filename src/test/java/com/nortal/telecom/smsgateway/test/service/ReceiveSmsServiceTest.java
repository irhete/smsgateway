package com.nortal.telecom.smsgateway.test.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.nortal.telecom.smsgateway.service.receivesms.ReceiveSmsServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ReceiveSmsServiceTest {

	@Mock
	private WebServiceTemplate receiveWebServiceTemplate;

	@InjectMocks
	private ReceiveSmsServiceImpl service;

	@Ignore
	@Test
	public void getReceivedSmsTest() {

	}
}
