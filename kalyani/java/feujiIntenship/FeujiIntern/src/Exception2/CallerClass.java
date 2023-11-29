package Exception2;

public class CallerClass {
	public void method() {
		System.out.println(" calling method");
		method1(null);
	}
	public void method1(int value[]) throws NullPointerException {
		
			System.out.println(value[value.length]);

}
}
