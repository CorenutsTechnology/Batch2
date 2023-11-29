package generics28thnov;

public class GenericMethods {
	
	public <T extends Comparable<T>> void print(T value1,T value2)
	{
//		System.out.println(value1);
//		System.out.println(value2);
		
		int val1=0;
		int val2=0;
		
		if(value1 instanceof Integer)
		{
			 val1=Integer.parseInt(value1.toString());
			 val2=Integer.parseInt(value2.toString());
			
		}
		else
		{
			System.err.println("we will get number format exception");
		}
		
		Boolean result=value1.equals(value2);
//		System.out.println(result);
//		System.out.println(val1+val2);
//		System.out.println((Object)value1.getClass().getSimpleName());  
	}
	
	public <T extends Comparable<T>> void pri(StudentClass<T> value1,T value2)
	{
//		System.out.println(value1+" "+value2);
	}
	
	public static void main(String[] args) {
		GenericMethods genericMethods=new GenericMethods();
		genericMethods.print("jyothi","jyothi");
		
		genericMethods.pri(new StudentClass<>(), 10);
	}

}
