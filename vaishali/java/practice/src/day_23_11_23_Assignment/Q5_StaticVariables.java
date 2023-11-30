package day_23_11_23_Assignment;

class StaticVariables{
	
	static String name;
	static int age;
	
	public StaticVariables() {
		name="rani";
		age=20;
		System.out.println("name : "+name+"\n"+"age :"+age);
	}
}

public class Q5_StaticVariables {
	
	public static void main(String[] args) {
		StaticVariables variables=new StaticVariables();
	}

}
