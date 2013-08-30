package com.nortal.telecom.smsgateway.scheduler;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleScheduler {

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws SchedulerException
	 */
	public static void main(String[] args) throws SchedulerException,
			InterruptedException {
		runScheduler();
	}

	private static void runScheduler() throws SchedulerException,
			InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Scheduler scheduler = (Scheduler) context.getBean("scheduler");
		scheduler.start();
		Thread.sleep(60000);
		scheduler.shutdown();
		context.close();
	}

}
