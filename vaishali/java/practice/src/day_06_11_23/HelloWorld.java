package day_06_11_23;

public class HelloWorld {
	static String name="corenuts";
	long longValue=10;
	double doubleValue=20;
	public static void main(String[] args) {
		System.out.println("hi..."+HelloWorld.name);
		HelloWorld helloWorld=new HelloWorld();
		System.out.println(helloWorld.longValue);
		System.out.println(helloWorld.doubleValue);
	}

}
