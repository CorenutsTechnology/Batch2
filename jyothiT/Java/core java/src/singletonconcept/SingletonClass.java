package singletonconcept;

public class SingletonClass {
	
	private static SingletonClass singleInstance=new SingletonClass();
	
	private SingletonClass()
	{
		
	}
	
     public static  SingletonClass getInstance()
	{
		return singleInstance;
	}
	
	public static void main(String[] args) {
		
		SingletonClass p1=SingletonClass.getInstance();
		SingletonClass p2=SingletonClass.getInstance();
		System.out.println("the hashcode of p1 is= "+p1.hashCode());
		System.out.println("the hashcode of p2 is= "+p2.hashCode());
		
		if(p1==p2)
		{
			System.out.println("two objects are poiniting to same object address");
			
		}
		else
		{
			System.out.println("two objects are pointing to different objects");
		}

		
	}

}
