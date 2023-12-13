package mapinterface_5DEC;

import java.util.HashMap;
import java.util.Map;

public class GetValues {
	
	public static void main(String[] args) {
		
	HashMap<Integer,String> hm=new HashMap();
	hm.put(1,"India");
	hm.put(2, "pakistan");
	hm.put(3, "Bangladesh");
	hm.put(4, "China");
	 System.out.println("\n-------------");
	    for(String s:hm.values())
	    {
	    	System.out.println("values :"+s);
	    }
	 System.out.println("\n-------------");
    
  }
}
