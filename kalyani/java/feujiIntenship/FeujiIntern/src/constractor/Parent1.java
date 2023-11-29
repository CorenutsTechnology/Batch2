package constractor;

public class Parent1 /*extends child2 */{//complietime error
	int value1;
	String name;
	public Parent1(int value1) {
		this.value1=value1;
	}
	public Parent1() {
		this(10);
	}
	
}
