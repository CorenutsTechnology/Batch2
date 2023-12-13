package non_access_modifier;

public class FinalKeyword {//if we declare the class as final we can't extend the final class.

    final static int k=20;
    
    public final void display()
    {
    	System.out.println("Display");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // k=10; we can't assign the value to final variable
	}

}
class Test extends FinalKeyword
{
	//we can't override the final method
	/*public final void display()
	{
		
	}*/
	
	
	//we can overload the final method
	public void display(int k)
	{
		
	}
}