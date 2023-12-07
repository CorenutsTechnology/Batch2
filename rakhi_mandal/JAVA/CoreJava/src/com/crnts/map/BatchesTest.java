package com.crnts.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BatchesTest {
	
	public static void main(String[] args) {
		BatchesTest test =new BatchesTest();
		test.displayBatch();
	}
	
	public void displayBatch()
	{
	List<Batches> empList = new ArrayList<>();
	
	empList.add(new Batches(1,"Tom","Batch-1"));
	empList.add(new Batches(2,"Jack","Batch-2"));
	empList.add(new Batches(4,"Abhi","Batch-2"));
	empList.add(new Batches(3,"Neil","Batch-1"));
	empList.add(new Batches(8,"Zoe","Batch-1"));
	
	Map<String, List<Batches>> map = new HashMap<>();
	List<Batches> temp = new ArrayList<>();
	for(Batches e: empList)
	{
		if(map.containsKey(e.getBatchName())) {
			temp = map.get(e.getBatchName());
			temp.add(e);
			map.put(e.getBatchName(), temp);
		}
		else
		{
			temp = new ArrayList<>();
			temp.add(e);
			map.put(e.getBatchName(), temp);
	}
		
	}for(Entry<String, List<Batches>> e: map.entrySet())
	{
		System.out.println(e.getKey() +" - " + e.getValue().size());
	}
	
//	System.out.println(temp);
	}
}
