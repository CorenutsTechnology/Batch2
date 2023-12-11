//9. Write a program to show the difference between HashMap and ConcurrentHashMap in multi threading environment.

package com.crnts.thread_2;


import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample extends Thread{
	static ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap();
	public void run() {
		try {
			Thread.sleep(1000);
			map.put(4, "Niha");
		} catch (InterruptedException e) {
						e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		ConcurrentHashMapExample example=new ConcurrentHashMapExample();
		ConcurrentHashMapExample example1=new ConcurrentHashMapExample();
		map.put(1, "rakhi");
		map.put(2, "neha");
		map.put(3, "tom");
//		map.put(null, "Sam");  java.lang.NullPointerException
		
		example.start();
		example1.start();
		
		for (Object obj : map.entrySet()) {
			System.out.println(obj);
			Thread.sleep(1000);
		}
		System.out.println(map);
	}
}
