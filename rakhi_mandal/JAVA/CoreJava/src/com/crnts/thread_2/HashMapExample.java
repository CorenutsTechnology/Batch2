package com.crnts.thread_2;

import java.util.HashMap;

public class HashMapExample extends Thread {
	
	static HashMap<Integer,String> map=new HashMap();
	
	public void run() {
		try {
			Thread.sleep(1000);
			map.put(4, "Niha");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread=new Thread();
		map.put(1, "tom");
		map.put(2, "jack");
		map.put(3,"joe");
		map.put(null, "sam");
		
		HashMapExample example=new HashMapExample();
//		HashMapExample example1=new HashMapExample();
		
		
		example.start();
//		example1.start();
		for (Object obj : map.entrySet()) {
			System.out.println(obj);
			Thread.sleep(1000);
		}
		System.out.println(map);
	}

}

