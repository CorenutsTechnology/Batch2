package setinterface_4DEC;

import java.util.*;
public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> h=new HashSet<Integer>();
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(1);
		
		Iterator<Integer> i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
