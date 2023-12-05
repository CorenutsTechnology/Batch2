package assignment5_accessSpecifier;

public class Program8 {
	static Program8 program8= new Program8();
	final int id=1;
	String name="rakhi";
	
	public void display()
	{
//		id=0; //final variable value cannot be changed
		name="swati";
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		program8.display();
	}


}
