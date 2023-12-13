package com.org.flowcontrol10;

import java.util.Scanner;

public class TimeTableMain {

	public static void main(String[] args) {
		TimeTable timetable=new TimeTable();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number tables");
		int noOftables=sc.nextInt();
		System.out.println("Enter upto number");
		int uptoNumber=sc.nextInt();
		timetable.multiplicationTable(noOftables,uptoNumber);
	}

}
