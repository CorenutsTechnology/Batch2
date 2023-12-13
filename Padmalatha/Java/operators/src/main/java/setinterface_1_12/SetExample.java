package setinterface_1_12;
import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> h=new HashSet<Integer>();
		h.add(1);
		h.add(2);
		h.add(1);
		h.add(2);
		h.add(3);
		Iterator<Integer> i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println();
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		lh.add(4);
		lh.add(3);
		lh.add(2);
		lh.add(1);
		lh.add(4);
		lh.add(3);
		lh.add(2);
		lh.add(1);
		System.out.println("Before sorting");
		Iterator<Integer> il=lh.iterator();
		while(il.hasNext())
		{
			System.out.println(il.next());
		}
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.addAll(lh);
		System.out.println("After sorting");
		Iterator<Integer> il1=ts.iterator();
		while(il1.hasNext())
		{
			System.out.println(il1.next());
		}
		
		HashSet<Person> h1=new HashSet<Person>();
		h1.add(new Person("padma",23));
		h1.add(new Person("padma",23));
		h1.add(new Person("siri",24));
		System.out.println("Before sorting");
		Iterator<Person> i2=h1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("After sorting");
		
		TreeSet<Person> ts1=new TreeSet<>();
		ts1.addAll(h1);
		Iterator<Person> i4=ts1.iterator();
		while(i4.hasNext())
		{
			System.out.println(i4.next());
		}
	
	}

	
}
class Person implements Comparable
{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		//System.out.println("Hash");
		/*
		 * Random rm=new Random(); return 1;
		 */
		return Objects.hash(age, name);
	}


	@Override
	public boolean equals(Object obj) {
		//System.out.println("Equals");
		  if (this == obj) 
			  return true; 
		  if (obj == null) 
			  return false; 
		  if (getClass()!= obj.getClass()) 
			  return false;
		  Person other = (Person) obj; 
		  return age ==other.age && Objects.equals(name, other.name);
		 
		
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	
	  @Override public int compareTo(Object o) { 
		  // TODO Auto-generated method stub
	    Person person=(Person)o; 
	   return this.name.compareTo(person.name); 
	  }
	 
	
}
