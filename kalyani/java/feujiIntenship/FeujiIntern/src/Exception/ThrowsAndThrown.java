package Exception;

public class ThrowsAndThrown  implements ThrowAndThrownInterface {


@Override
public void ThrownAndThrow() {
	System.out.println("ThrownAndThrow");
}

	public void fuction1() {
		System.out.println(" calling function1");
		function2();
		System.out.println("calling function2");
	}
	public void function2() {
		System.out.println("called function 2");
		calculate(10, 0);
	}
	

	public void calculate( int value1 ,int value2) {
		
		int result=value1/value2;
		System.out.println("called function");
		
	
}
}