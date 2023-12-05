package assignment5_accessSpecifier;

public class Program4_1 extends Program4 {
	static Program4_1 program4_1=new Program4_1();
	public static void main(String[] args) {
		program4_1.display();
//		program4_1.defaultMethod();   //not accessible by object creation
//		program4_1.protectedMethod();   //not accessible by object creation
	}
	public void display()
	{
		program4_1.defaultMethod();  
		program4_1.protectedMethod();
		
		System.out.println(type2);
		System.out.println(type3);
		
	}

}
