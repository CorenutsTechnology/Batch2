package mapinterface_5DEC;

import java.util.*;
import java.util.Map.Entry;

public class GetKeys$GetValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap();
		hm.put(1,"India");
		hm.put(2, "pakistan");
		hm.put(3, "Bangladesh");
		hm.put(4, "China");
		hm.put(1,"India1");
		Iterator iterator=hm.entrySet().iterator();
		while(iterator.hasNext())
		{
			Entry<Integer,String> entry=(Entry<Integer, String>) iterator.next();
			System.out.println("key :"+entry.getKey()+" value :"+entry.getValue());
		}
		
	}

}
