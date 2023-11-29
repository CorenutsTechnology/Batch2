package constructor23thnov;

public class ThisConstructorChaining {
	
	
	public ThisConstructorChaining() {
		System.out.println("default constructor");
	}
	public ThisConstructorChaining(String name)
	{
		this();
		System.out.println(name);
	}
	public ThisConstructorChaining(String name,int fees)
	{  
		this(name);
		System.out.println(fees);
	}
		
	
}
