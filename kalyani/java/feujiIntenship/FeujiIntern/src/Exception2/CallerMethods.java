package Exception2;

public class CallerMethods implements NestedTry {

	@Override
	public void nestedTry() {
		// TODO Auto-generated method stub
		
	}
	public void method() {
		System.out.println(" calling method");
		try {
			method1(null);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
	public void method1(int value[]) throws NullPointerException {
		
			System.out.println(value[value.length]);
		
	}
	

}
