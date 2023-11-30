package day_08_11_23_Assignment;

public class WithoutDeclaringArraySize {

	public static void main(String[] args) {
		WithoutDeclaringArraySize arraySize=new WithoutDeclaringArraySize();
		arraySize.arrayMethod();
	}
	public void arrayMethod() {
		double doubleValue[]= {34,23,3};
		System.out.println(doubleValue[0]);
		System.out.println(doubleValue[1]);
		System.out.println(doubleValue[2]);
	}
}
