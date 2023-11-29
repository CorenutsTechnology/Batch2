package generics28thnov;

public class RestrictinGeneric { 
	
	public <T>void verify(T value1,T value2)
	{
		if(value1 instanceof Integer && value2 instanceof Integer)
		{
			int val1=Integer.parseInt(value1.toString());
			int val2=Integer.parseInt(value2.toString());
			int result=val1+val2;
			System.out.println(result);
		}
		if(value1 instanceof Integer && value2 instanceof Integer)
		{
			int val1=Integer.parseInt(value1.toString());
			int val2=Integer.parseInt(value2.toString());
			int result=val1+val2;
			System.out.println(result);
		}
	}
	
	public <T>void addition(T value1,T value2)
	{
	   
	}
	public static void main(String[] args) {
		RestrictinGeneric g=new RestrictinGeneric();
		g.verify(10.0,10.0);
	}

}
