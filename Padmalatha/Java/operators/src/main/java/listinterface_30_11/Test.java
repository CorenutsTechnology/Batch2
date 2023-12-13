package listinterface_30_11;

import java.util.*;
//4.
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5,b=4,c=3,d=2,e=1;
		Integer[] array = new Integer[] { a, b, c, d, e };
		ArrayList1 al = new ArrayList1();//1.
		List l = al.toCollection(array);
		
		/*
		 * ArrayList<Integer> al1=new ArrayList<Integer>(); al1.add(1); al1.add(1);
		 * al1.add(1); al1.add(1); al1.add(1); al1.set(1, 10); for (Object i : al1) {
		 * System.out.println((Integer) i); }
		 */
		//ArrayList al1=new ArrayList();
		
          
		for (Object i : l) {
			System.out.println((Integer) i);
		}

		//to traverse in reverse way
		System.out.println();
		ListIterator lI = l.listIterator(l.size());
		while (lI.hasPrevious()) {
			System.out.println(lI.previous());
		}
		
		System.out.println();//2.
		Object[] o=al.toArray(l);
		for(Object i:o)
		{
			System.out.println(i);
		}
		
		
		//5.
		al.displayStudents();
		
		//sorting by names
		al.sortStudents();
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		Enumeration<Integer> it=v.elements();
		while(it.hasMoreElements())
		{
			System.out.println(it.nextElement());
		}
		
		 
	}

}
