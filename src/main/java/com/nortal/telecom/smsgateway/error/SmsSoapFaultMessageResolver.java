package com.nortal.telecom.smsgateway.error;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.FaultMessageResolver;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.SoapFaultClientException;

public class SmsSoapFaultMessageResolver implements FaultMessageResolver {

	public void resolveFault(WebServiceMessage message) throws IOException {
		SoapMessage soapMessage = (SoapMessage) message;

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		soapMessage.writeTo(byteArrayOutputStream);
		String xmlMessage = byteArrayOutputStream.toString();
		System.out.println(xmlMessage);

		throw new SoapFaultClientException(soapMessage);
	}

}
