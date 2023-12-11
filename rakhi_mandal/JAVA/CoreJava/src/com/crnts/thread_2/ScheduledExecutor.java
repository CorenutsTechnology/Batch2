//Write a program to schedule the job execution using ScheduleExecutorService
package com.crnts.thread_2;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutor {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledThreadPool= Executors.newScheduledThreadPool(5);
		scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Message sent"+Thread.currentThread().getName());
			}
		}, 5, 10, TimeUnit.SECONDS);
//		scheduledThreadPool.shutdown();
			}
	

}
