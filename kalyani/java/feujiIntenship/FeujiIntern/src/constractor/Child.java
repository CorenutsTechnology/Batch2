package constractor;

public class Child extends Parent1 {
	int value2;
	String name;
	public Child(int value1,String name) {
		super(value1);
		this.value2=value2;
		this.name=name;
	}
	
	public Child(int value1) {
		super(value1);
		
	}
	
	

public void method() {
	System.out.println("method1");
}
	public static void main(String[] args) {
		
		Child  child=new Child(10,"renuka");
		child.method();
		Parent1  child1=new Child(20,"kanna");
		System.out.println(child.value1);
		System.out.println(child.name);
		System.out.println(child.value2);
		System.out.println();
		
		System.out.println(child1.value1);
		System.out.println(child1.name);
	}

}
