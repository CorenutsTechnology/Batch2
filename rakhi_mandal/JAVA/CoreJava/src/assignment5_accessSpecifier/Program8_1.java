package assignment5_accessSpecifier;

public class Program8_1 {
	static Program8 program8= new Program8();
	public static void main(String[] args) {
		program8.display();
	}
	public void display()
	{
//		program8.id=0; //final variable value cannot be changed
		program8.name="swati";
		System.out.println(program8.id);
		System.out.println(program8.name);
	}

}
