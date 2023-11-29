package week2.exam;

 class Acc{
	   private int x;
	    public int y;
	       void cal(int a, int b)
	       {
	           x =  a + 1;
	           y =  b;
	       } 
	        void test()
	       {
	    	   System.out.println(x);
	       }
  }   
  public class LeftShiftOperator 
  {
      public static void main(String args[])
      {
    	   Acc obj = new Acc();   
           obj.cal(2, 3);
           System.out.println(obj.y  );  
           obj.test();

}
  }
