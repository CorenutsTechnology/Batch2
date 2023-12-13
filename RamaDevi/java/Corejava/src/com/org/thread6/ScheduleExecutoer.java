package com.org.thread6;

import java.util.Calendar;

public class ScheduleExecutoer implements Runnable{
int number;
public ScheduleExecutoer(int number)
{
	this.number=number;
}

	@Override
	public void run() {
		System.out.println("Number " + number + " Current time:"+Calendar.getInstance().getTimeZone());
	            
	            //+ Calendar.getInstance().get(Calendar.SECOND));
	}

}
