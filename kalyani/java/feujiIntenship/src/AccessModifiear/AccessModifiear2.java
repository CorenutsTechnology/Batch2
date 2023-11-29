package AccessModifiear;

public class AccessModifiear2 extends Accesmodifiear {
 private int num1=10;
 protected double num2=20.5;
 String Stringname="kalyani";
 public boolean booleaname=false;
	public static void main(String[] args) {
		Accesmodifiear Accesmodifiear= new Accesmodifiear();
		AccessModifiear2  AccessModifiear2 =new AccessModifiear2 ();
		Accesmodifiear.add2();
		Accesmodifiear.add3();
		Accesmodifiear.add(20, 30);
		System.out.println(AccessModifiear2 .num1);
		System.out.println(AccessModifiear2 .num2);
		System.out.println(AccessModifiear2.Stringname);
		System.out.println(AccessModifiear2.booleaname);
		
		
	}
	


}
