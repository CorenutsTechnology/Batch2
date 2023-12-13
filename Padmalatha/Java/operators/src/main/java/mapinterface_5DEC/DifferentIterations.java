package mapinterface_5DEC;

import java.util.*;
import java.util.Map.Entry;
public class DifferentIterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap();
		hm.put(1,"India");
		hm.put(2, "pakistan");
		hm.put(3, "Bangladesh");
		hm.put(4, "China");
		System.out.println("Using for loop");
	    for(Map.Entry<Integer,String> entry:hm.entrySet())
	    {
	    	System.out.println("Key :"+entry.getKey()+"  Value :"+entry.getValue());
	    }
	    
	    System.out.println("\nUsing Iterator");
	    Iterator iterator=hm.entrySet().iterator();
	    while(iterator.hasNext())
	    {
	    	Map.Entry<Integer, String> entry=(Entry<Integer, String>) iterator.next();
	    	System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
	    }
	    System.out.println("\n-------------");
	    for(Integer i:hm.keySet())
	    {
	    	System.out.println("key :"+i);
	    }
	    System.out.println("\n-------------");
	    for(String s:hm.values())
	    {
	    	System.out.println("values :"+s);
	    }

	}

}
