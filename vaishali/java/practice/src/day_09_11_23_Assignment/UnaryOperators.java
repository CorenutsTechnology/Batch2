package day_09_11_23_Assignment;

public class UnaryOperators {

	public int preIncrement(int value) {
		++value;
		System.out.println("preIncrement value : "+value);
		return value;
	}
	
	public int preIncrement1(int value) {
		System.out.println("preIncrement1 value : "+ ++value);
		return value;
	}
	
	public int preIncrement2(int value) {
		++value;
		System.out.println("preIncrement2 value : "+ ++value);
		return value;
	}
	
	public double preIncrement3(double value) {
		++value;
		System.out.println("preIncrement3 value : "+value);
		return value;
	}
	
	public int postIncrement(int value) {
		value++;
		System.out.println("postIncrement value : "+value);
		return value;
	}
	
	public int postIncrement1(int value) {
		System.out.println("postIncrement2 value : "+ value++);
		return value;
	}
	
	public int postIncrement2(int value) {
		value++;
		System.out.println("postIncrement2 value : "+ value++);
		return value;
	}
	
	public double postIncrement3(double value) {
		value++;
		System.out.println("postIncrement3 value : "+value);
		return value;
	}
	
	public int preDecrement(int value) {
		--value;
		System.out.println("preDecrement value : "+value);
		return value;
	}
	
	public int preDecrement1(int value) {
		System.out.println("preDecrement1 value : "+ --value);
		return value;
	}
	
	public double preDecrement2(double value) {
		--value;
		System.out.println("preIncrement3 value : "+value);
		return value;
	}
	
	public int postDecrement(int value) {
		value--;
		System.out.println("postDecrement value : "+value);
		return value;
	}
}
