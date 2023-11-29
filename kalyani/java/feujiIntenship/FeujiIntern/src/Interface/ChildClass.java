package Interface;

public class ChildClass implements child  {

	public static void main(String[] args) {
		
		parent ChildClass=new ChildClass ();
		ChildClass.parent();
		child ChildClass1=new ChildClass ();
		ChildClass1.child();
		ChildClass 	 ChildClass2=new ChildClass ();
		ChildClass2.child();
		ChildClass2.parent();
	}

	@Override
	public void parent() {
		System.out.println("parent");
		
	}

	@Override
	public void child() {
		System.out.println("child");
		
	}

}
