package assignment6_Interface_Abstract;

public class Child_Class_P2 extends Abstract_Class_P2 {

	public static void main(String[] args) {
		Child_Class_P2 child_Class_P2=new Child_Class_P2();
		child_Class_P2.show();
	
	}
@Override
	void show() {
		System.out.println("method implementation from Child_Class_P2 ");
		System.out.println(name);
		System.out.println(getId());
		System.out.println(id1);
	}

}
