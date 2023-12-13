package setinterface_1_12;
import java.util.*;
public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Student> ts=new TreeSet<Student>(new NameComparator());
		ts.add(new Student(1,"Krishna",23,"CSE"));
		ts.add(new Student(2,"Radha",23,"CSE"));
		ts.add(new Student(3,"Balarama",23,"CSE"));
		ts.add(new Student(4,"Revathi",23,"CSE"));
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
