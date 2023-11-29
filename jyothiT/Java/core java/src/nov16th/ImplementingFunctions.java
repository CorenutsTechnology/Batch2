package nov16th;

public class ImplementingFunctions implements DeclaringFunction {

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		System.out.println("addition method");
		
	}

	@Override
	public void substract() {
		// TODO Auto-generated method stub
		System.out.println("substraction method");
		
	}
	public static void main(String[] args) {
		
		ImplementingFunctions functions=new ImplementingFunctions();
		functions.addition();
		functions.substract();
	}

}
