package com.ass.flowcontrol;

public class TimeTable {
	public static void main(String[] args) {
		TimeTable multipicatiomTables=new TimeTable();
		multipicatiomTables.multipicationTable();
	}
	
	public void multipicationTable() {
		System.out.println("* | 1 2 3 4 5 6 7 8 9");
		System.out.println("--------------------------------");
		for(int number=1;number<=9;number++) {
			System.out.print(number+" | ");
			for(int multiplyBy=1;multiplyBy<=9;multiplyBy++) {
				
				System.out.print(number*multiplyBy+" ");
			}
			System.out.println();
				
		}
		
		
	}

}
