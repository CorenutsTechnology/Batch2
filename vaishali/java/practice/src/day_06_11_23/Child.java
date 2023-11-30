package day_06_11_23;

public class Child extends Parent {
	public void childMethod() {
		System.out.println("child");
	}
	public static void main(String[] args) {
			Child child= new Child();
			child.childMethod();
			parentMethod();
	}

}

