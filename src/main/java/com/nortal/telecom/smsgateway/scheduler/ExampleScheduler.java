package com.nortal.telecom.smsgateway.scheduler;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import com.nortal.telecom.smsgateway.model.job.HelloJob;

public class ExampleScheduler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ExampleScheduler().runScheduler();
	}

	private void runScheduler() {
		try {
			// Grab the Scheduler instance from the Factory
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

			// and start it off
			scheduler.start();

			// define the job and tie it to our HelloJob class
			JobDetail job = newJob(HelloJob.class).withIdentity("job1",
					"group1").build();

			// Trigger the job to run now, and then repeat every 40 seconds
			Trigger trigger = newTrigger()
					.withIdentity("trigger1", "group1")
					.startNow()
					.withSchedule(
							simpleSchedule().withIntervalInSeconds(5)
									.repeatForever()).build();

			// Tell quartz to schedule the job using our trigger
			scheduler.scheduleJob(job, trigger);

			Thread.sleep(60000);
			scheduler.shutdown();

		} catch (SchedulerException se) {
			se.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
