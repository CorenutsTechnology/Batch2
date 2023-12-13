package mapinterface_5DEC;

import java.time.Duration;
import java.time.Instant;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.*;

public class Sorting {
	//Hashset
	public static void main(String[] args) {
		HashMap<Integer,Employee1> lhm=new HashMap<Integer,Employee1>();
		lhm.put( 3,new Employee1(3,"nani","java developer",45000,0));
		lhm.put(2,new Employee1(2,"chandrika","Assosiate s/w",35000,1));
		lhm.put(1,new Employee1(1,"sravs","Assosiate s/w",35000,1));
		Set<Integer> s=lhm.keySet();
		ArrayList<Integer> al=new ArrayList<>();
		al.addAll(s);
		Collections.sort(al);
		Iterator iterator=al.iterator();
		while(iterator.hasNext())
		{
			Integer k=(Integer) iterator.next();
			System.out.println("Key:"+k+" Value:"+lhm.get(k));
		}
		
	}

}
