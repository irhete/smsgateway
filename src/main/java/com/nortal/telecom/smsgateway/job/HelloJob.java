package com.nortal.telecom.smsgateway.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.nortal.telecom.smsgateway.service.ReceiveSmsService;

public class HelloJob extends QuartzJobBean {

	private ReceiveSmsService receiveSmsService;

	public void setReceiveSmsService(ReceiveSmsService receiveSmsService) {
		this.receiveSmsService = receiveSmsService;
	}

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {

		receiveSmsService.getReceivedSms();

	}

}
