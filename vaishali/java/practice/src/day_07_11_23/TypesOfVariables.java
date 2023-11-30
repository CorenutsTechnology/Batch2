package day_07_11_23;

public class TypesOfVariables {
	
	long longValue=10;
	double doubleValue=20;
	int intValue;
	static String name;//global variables have default values
	
	Person person;
	
	public void calculate(int value1,double value2) {
		double multiplicationOfTwoValues=value1*value2;
		System.out.println("Multiplication Of Two Values - "+multiplicationOfTwoValues);
	}
	
	public double calculate1(int value1,double value2) {
		double result=value1+value2;
		return result;
	}
	
	public  static double calculate2(int value1,double value2) {
		double result=value1-value2;
		return result;
	}
	public static void main(String[] args) {
		System.out.println("string value - "+TypesOfVariables.name);
		
		TypesOfVariables typesOfVariables=new TypesOfVariables();
		
		System.out.println("long value - "+typesOfVariables.longValue);
		System.out.println("double value - "+typesOfVariables.doubleValue);
		System.out.println("integer value - "+typesOfVariables.intValue);
		
		typesOfVariables.calculate(20, 40.5);
		
		int intValue=30;
		System.out.println("int value - "+intValue);
		
		boolean flag=true;
		System.out.println("boolean value - "+flag);
		
		float floatValue;
//		System.out.println("float value - "+floatValue); //before using the local variable we have initialize the local variable
		
		System.out.println("sum of two values - "+typesOfVariables.calculate1(2, 3));
		
		System.out.println("sub of two values - "+typesOfVariables.calculate2(54, 12));
		
		System.out.println("person value - "+typesOfVariables.person);
		
		Person person = new Person();
		System.out.println(person);
		
		person.setName("vaishali");
		System.out.println("person name - "+person.getName());
		
		person.setAge(22);
		System.out.println("person age - "+person.getAge());
	}

}
