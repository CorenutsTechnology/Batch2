package gnerics_28_11;

public class GenericMethod<T> {
	
	public <T> String display(A<? extends B > value2)
	{
		return "Hi";
    }
	
	/*
	 * public <T> String display(Generic<? super C> value1,Generic<? extends A >
	 * value2) {
	 * 
	 * return "Hello"; }
	 */	
	
	public static void main(String[] args) {
		
		/*
		 * GenericMethod gm=new GenericMethod(); Generic g=new Generic();
		 * g.setName("roja"); g.setLocation("hyderabad"); System.out.println(g);
		 * System.out.println(gm.display(g,new A())); Generic <String> obj1=new
		 * Generic<>(); Generic <String> obj2=new Generic<>(); gm.<String>display(new
		 * A(),obj2);
		 */
		
		
		 GenericMethod gm=new GenericMethod();
		 Generic g =new Generic<>();
		A a=new A();
		B b=new B();
		C c=new C();
		System.out.println(gm.<String>display(a));
	}

}
class A<T> {
	
}
class B extends A{
	
}
class C extends B{
	
}