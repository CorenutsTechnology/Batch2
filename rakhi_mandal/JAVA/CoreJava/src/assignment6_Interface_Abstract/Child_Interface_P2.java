package assignment6_Interface_Abstract;

public class Child_Interface_P2 implements Interface_P2 {

	public static void main(String[] args) {
		Child_Interface_P2 child_Interface_P2=new Child_Interface_P2();
		System.out.println(id);
	//	child_Interface_P2.display(); //static methods are not accessible
		
		child_Interface_P2.display1(); //default methods are  accessible
		child_Interface_P2.show();
	}

	@Override
	public void show() {
		System.out.println("method implementation from Child_Interface_P2 ");
		
	}

}
