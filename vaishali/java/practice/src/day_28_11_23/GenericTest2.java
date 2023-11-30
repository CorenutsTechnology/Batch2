package day_28_11_23;

public class GenericTest2 {

	public static void main(String[] args) {
		
		GenericClass<Integer> generic=new GenericClass<Integer>();
		generic.calculate(12);
		System.out.println("Integer generic type - "+generic.calculate(12));
		
		GenericClass<String> generic1=new GenericClass<String>();
		generic1.calculate("abc");
		System.out.println("String generic type - "+generic1.calculate("abc"));
		
		GenericClass<Person> generic2=new GenericClass<Person>();
		generic2.calculate(new Person());
		System.out.println("Person generic type - "+generic2.calculate(new Person()));
	}

}
