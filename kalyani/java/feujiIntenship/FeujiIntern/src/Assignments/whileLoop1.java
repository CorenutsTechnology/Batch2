package Assignments;

import nov7Th.Person;

public class whileLoop1 {

	public void whileLoop() {
		boolean flag=true;
		int i=0;
		while(flag) {
			System.out.println("loop"+i);
			int j=0;
			do {
				if(i==6) {
					System.out.println("6th ieration");
					continue;
				}
				i++;
				
			}while(j++<10);
			flag=(i++<=10);
		}

	}
	public void forLoop() {
		String[] value= {"hyderabad","bengolere","chennai"};
		for(int i=0;i<value.length;i++) {
			System.out.println(value[i]);
		}
	}
	public void forLoop1() {
		Person object1=new Person();
		object1.setPersonage(22);
		object1.setPersonname("kalyani");
		Person object2=object1;
		Person[] values= {new Person("kalyani",12),new Person(),new Person(), new Person(),object1,object2};
		
		for(int i=0;i<values.length;i++) {
			Person person=values[i];
			System.out.println(person.getPersonname());
			System.out.println(person.getPersonage());
		}
		
	}

}
