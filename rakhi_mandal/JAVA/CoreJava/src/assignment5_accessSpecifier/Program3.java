package assignment5_accessSpecifier;

public abstract class Program3 {

	public static void main(String[] args) {
//		--------------variables--------------
	    final String type1="final_variable";
//	    abstract String type2="abstract_variable"; //variable can not be abstract
	}
	
//	--------------method--------------
	final  void display()
	{
		System.out.println("final method");
	}
	
	abstract  void display1();

}
