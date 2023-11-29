package week2.exam;

public class A {
	 public static void main(String args[])
	 {
         access obj = new access();   
         obj.cal(2, 3);
         System.out.println(" " + obj.y);
	    }
}
	
	
  
 class access
{
	private int x;
    public int y;
    void cal(int a, int b)
    {
        x =  a + 1;
        y =  b;
    }   
   
}
	



