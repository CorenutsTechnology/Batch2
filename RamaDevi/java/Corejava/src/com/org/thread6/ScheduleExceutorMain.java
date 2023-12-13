package com.org.thread6;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExceutorMain {

	public static void main(String[] args) {
		ScheduledExecutorService exce = Executors.newScheduledThreadPool(5);
		for (int i = 1; i <= 10; i++) {
			exce.schedule(new ScheduleExecutoer(i), i, TimeUnit.SECONDS);

		}
		System.out.println(Thread.currentThread().getName());
	}

}
