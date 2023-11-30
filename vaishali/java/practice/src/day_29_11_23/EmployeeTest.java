package day_29_11_23;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee<String> employee=new Employee<String>();
		employee.setName("rani");
		employee.setAge("20");
		
//		employee.setAge(22); //it id is not applicable for the arguments integer
		
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
		
		Employee<Integer> employee2=new Employee<Integer>();
		employee2.setAge(18);
		employee2.setName(100);
		
//		employee2.setName("raj");//it id is not applicable for the arguments string
		
		System.out.println(employee2.getName());
		System.out.println(employee2.getAge());
		
	}

}
