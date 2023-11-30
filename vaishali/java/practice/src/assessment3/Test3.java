package assessment3;

class A
{
 void calculate(int a, int b)
 {
 System.out.print(" Class A, ");
 }
}
class B extends A
{
 @Override
 void calculate(int a, int b)
 {
 System.out.print(" Class B, ");
 }
}
class C extends B
{
 @Override
 void calculate(int a, int b)
 {
 System.out.print(" Class C, ");
 }
}

public class Test3 {

	public static void main(String[] args) {
		A a = new B();
		a.calculate(10, 20);
		B b = (B) a;
		b.calculate(50, 100);
//		C c = (C) b;
//		c.calculate(100, 200);
		
		byte byte1=(byte)300;
		System.out.println(byte1);
	}

}
