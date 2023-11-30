package day_23_11_23_Assignment;

public class Q3_ConstructorOverloadingTest {
	
	public static void main(String[] args) {
		Q3_Employee employee=new Q3_Employee();
		employee=new Q3_Employee("rani",22);
//		employee.setAge(22);
		System.out.println(employee.getAge());
	}

}
