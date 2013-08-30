package com.nortal.telecom.smsgateway.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class HelloJob extends QuartzJobBean {

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {

		System.out.println("HelloJob is executing!");

	}

}
