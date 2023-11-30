package assessment3;

class Parent
{
 void method(int a)
 {
 System.out.println("ONE");
 }
 void method(double d)
 {
 System.out.println("TWO");
 }
}
class Child2 extends Parent
{
 @Override
 void method(double d)
 {
 System.out.println("THREE");
 }
}


public class Test4 {

	public static void main(String[] args) {
		new Child2 ().method(100);

	}

}
