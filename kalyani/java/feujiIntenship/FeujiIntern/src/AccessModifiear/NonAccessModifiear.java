package AccessModifiear;

public abstract class NonAccessModifiear {
	 static final 	int num=10;
//	 int num=20; cannot re intiatized the final values
	 static final String Stringname="kalyani";
	
	public static void main(String[] args) {
		System.out.println(num);
	
		
		
	}
	
public abstract void method();
 public   /* final*/ abstract void method1();
}
