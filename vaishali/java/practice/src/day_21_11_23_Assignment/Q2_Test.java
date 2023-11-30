package day_21_11_23_Assignment;

public class Q2_Test {

	public static void main(String[] args) {
		
		//encapsulation
		
		Q2_Person person=new Q2_Person();
		person.setName("vaishali");
		person.setAge(22);
		System.out.println("name : "+person.getName());
		System.out.println("age : "+person.getAge());
		
		
		
		//abstraction
		
		Q2_Circle circle=new Q2_Circle();
		circle.area(5);
	}

}
