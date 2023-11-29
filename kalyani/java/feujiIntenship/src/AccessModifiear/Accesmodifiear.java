package AccessModifiear;

public class Accesmodifiear extends FinalClass {//the Accesmodifiear cannot Subclass the final class FinalClass
	int  value=10;
	
	public static void main(String[] args) {
	Accesmodifiear Accesmodifiear=new Accesmodifiear() ;
	Accesmodifiear.add(10,20);
	System.out.println(Accesmodifiear.value);
	
	}

		
		
	
	
	public void add( int value1,  double value2) {
		System.out.println("add"+value1+value2);
	}
	private void add1() {
		
	}
	protected void add2() {
		System.out.println("add2");
		
	}
	void add3() {
		System.out.println("add3");
	}

}
