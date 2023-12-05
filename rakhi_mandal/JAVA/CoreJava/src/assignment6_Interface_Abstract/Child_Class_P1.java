package assignment6_Interface_Abstract;

public class Child_Class_P1 implements Parent_Interface_P1 {

	public static void main(String[] args) {
		Child_Class_P1 child_Class_P1=new Child_Class_P1();
		child_Class_P1.calculate(1, 20);
	}

	@Override
	public void calculate(int value1,int value2) {
		int sum= value1 +value2;
		System.out.println(sum);
		
	}

}
