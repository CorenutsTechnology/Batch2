package com.feuji20nov;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeAndDate 
{
	public static void main(String[] args) 
	{
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
			LocalDateTime now=LocalDateTime.now();
		System.out.println(dtf.format(now));
		System.out.println(java.time.LocalDateTime.now());
		
	}

}
