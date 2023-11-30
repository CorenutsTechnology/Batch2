package day_29_11_23;

public class GenericMethodClass {

	public <T> void calculate(Employee<T> value1, Employee<T> value2) {
		System.out.println("mehod 1");
	}
	
	public <T> void calculate(T value1, T value2) {
		System.out.println("method 2");
	}
	
	public static void main(String[] args) {
		GenericMethodClass method =new GenericMethodClass();
		
		Employee employee1=new Employee<Integer>();
		Employee employee2=new Employee<String>();
		
		method.calculate(employee1, employee2);
		
		method.<Integer>calculate(20, 30);
	}
}
