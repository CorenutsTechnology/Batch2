package com.december06;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest9
{	
	public static void main(String[] args) {
		Map<Integer,Integer> concurrentHashMap = new ConcurrentHashMap<>();
		new Thread(new Thread1(concurrentHashMap)).start();
		new Thread(new Thread2(concurrentHashMap)).start();
		new Thread(new Thread3(concurrentHashMap)).start();
//		System.out.println(concurrentHashMap.);
		
	}
}
