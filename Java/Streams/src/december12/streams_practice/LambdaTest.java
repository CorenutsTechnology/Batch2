package december12.streams_practice;

public class LambdaTest {
	
	//method reference example
	
	public  double summing(double d , double b)
	{
		System.out.println(d+b+" in non static method reference");
		return d+b;
	}
	
	//static method reference
	public static void testing(int j)
	{
		System.out.println(j+" static method reference");
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("run method");

			}
		});
		thread.start();
		
		Runnable runnable = new Runnable() {		
			@Override
			public void run() {
				System.out.println("run2 method");
				
			}
		};
		Thread thread2 = new Thread(runnable);
		thread2.start();
		
		MyInterface interface1 = new MyInterface() {		
			@Override
			public double calculate(double d1, double d2) {
				return d1+d2;
			}
		};
		
		
		double result=LambdaTest.sum(interface1);
		//another way
		
		double result2 = LambdaTest.sum((double d1 , double d2)->{
			return d1+d2;
		});
		System.out.println("method calling: "+result2);
		//method reference example
		MyInterface interface2 = new LambdaTest()::summing;
		interface2.calculate(1,2);
		
		MyInterface2 myInterface2 = LambdaTest::testing;
		myInterface2.test(10);
	}
	
	public static double sum(MyInterface interface1)
	{
		double result = interface1.calculate(12, 20);
		return result;
	}
	
}
