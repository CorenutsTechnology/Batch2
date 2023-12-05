package assignment5_accessSpecifier;

public class Program1_1 extends Program1 {

	public static void main(String[] args) {
//		object creation
		
//		Program1 program1 =new Program1();
//		System.out.println(program1.name);
//		program1.display();
//		---------------------------------------------
//      Inheritance
		Program1_1 program1_1=new Program1_1();
		program1_1.inheritenceMethod();
	}
	public void inheritenceMethod()
	{
		display();
		System.out.println(name);
	}

}
