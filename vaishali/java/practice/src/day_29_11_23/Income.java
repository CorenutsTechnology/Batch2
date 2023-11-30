package day_29_11_23;

public class Income {

	public <T> T salary(T salary) {
		System.out.println("method1");
		return salary;
	}
	
	public <T> void salary(Employee<T> salary) {
		System.out.println("method2");
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		Income income=new Income();
		
		income.<Integer>salary(30000);
		System.out.println(income.<Integer>salary(30000));
		
		income.salary(new Employee());
		
		
	}

}
