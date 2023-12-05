package assignment6_Interface_Abstract;

public interface Interface_P2 {
//	 Interface_P2 Interface_P2=new Interface_P2();   --object creation not possible
	public static void main(String[] args) {
		System.out.println("It is interface");
		display();
	}
	
	
	 static  void display()
	{
		System.out.println("Interface static method");
	}
	 default void display1()
	{
		System.out.println("Interface default method");
	}
	 private  void display2()
		{
			System.out.println("Interface private method");
		}
	
	 void show();
	 int id=9;
	// private int id=9; //private variable not possible
	// protected int id1=9; //protected variable not possible
	
}
