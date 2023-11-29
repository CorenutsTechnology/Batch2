package Generic;

public class GenericClassTest<T> implements GenericInterface<T> {

	public static void main(String[] args) {
		GenericClass <String> genericClass=new GenericClass<String>();
		genericClass.setName("kalyani");
		System.out.println(genericClass.getName());
		GenericClass <Integer> genericClass1=new GenericClass<Integer>();
		genericClass1.setAge(23);
		System.out.println(genericClass1.getAge());
		GenericClassTest type=new GenericClassTest();
		type.method();
	}

	@Override
	public void method() {
		System.out.println("method");
		
	}

}
