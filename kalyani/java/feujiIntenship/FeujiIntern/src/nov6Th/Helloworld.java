package nov6Th;

import nov7Th.Person;

public class Helloworld {
	static String name="corents";
	static int val=5;
	long longValue=10000;
	double doubleValue=1222.12;
	char paravalue;
	
	public double calculate(long value1,double value2) {
		double result=Helloworld.val+value1*value2;
		return result;
	}
	public static double calculate2(long value1,double value2) {
		double result=value1*value2;
		return result;
	}
	public static void main(String[] args) { 
		double result=0;
				System.out.print(name);
				System.out.println(Helloworld.name);
				Helloworld hellowolrd=new Helloworld();
				System.out.println(hellowolrd.doubleValue); 
				result=hellowolrd.calculate(12,10.5);
				System.out.println(result);
				System.out.println(hellowolrd.paravalue);
				System.out.println(calculate2(23,45.0));
				
				Person person=new Person();
				person.setPersonname("kalyani");
				person.setPersonage(22);
			System.out.println(person.getPersonname());
			System.out.println(person.getPersonage());
			System.out.println(args[1]);
			System.out.println(args[3]);
				
				 
			
	}

}
