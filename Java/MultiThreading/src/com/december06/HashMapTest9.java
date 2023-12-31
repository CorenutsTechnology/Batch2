package com.december06;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class HashMapTest9
{
	public static void main(String[] args) 
	{
		Map<Integer,Integer> map = new ConcurrentHashMap<Integer,Integer>();
		new Thread(new Thread91(map)).start();
		new Thread(new Thread92(map)).start();
		new Thread(new Thread93(map)).start();
	}
	
}
