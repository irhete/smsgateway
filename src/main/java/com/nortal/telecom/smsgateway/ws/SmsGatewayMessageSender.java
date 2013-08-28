package com.nortal.telecom.smsgateway.ws;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.springframework.ws.transport.WebServiceConnection;
import org.springframework.ws.transport.http.CommonsHttpConnection;
import org.springframework.ws.transport.http.CommonsHttpMessageSender;

public class SmsGatewayMessageSender extends CommonsHttpMessageSender {

	private Map<String, String> requestHeaders;

	public SmsGatewayMessageSender(HttpClient httpClient) {
		super(httpClient);
	}

	@Override
	public WebServiceConnection createConnection(URI uri) throws IOException {
		CommonsHttpConnection connection = (CommonsHttpConnection) super
				.createConnection(uri);
		if (requestHeaders != null) {
			for (String key : requestHeaders.keySet()) {
				connection.getPostMethod().addRequestHeader(key,
						requestHeaders.get(key));
			}
		}
		return connection;
	}

	public void setRequestHeaders(Map<String, String> requestHeaders) {
		this.requestHeaders = requestHeaders;
	}
}
