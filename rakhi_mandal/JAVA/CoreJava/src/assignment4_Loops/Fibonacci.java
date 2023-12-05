package assignment4_Loops;

public class Fibonacci {
	 static int c=1;
	public static void main(String [] args) 
		{  
		   fibo();
			
		}
		public  static void fibo() 
		{ int value1=0;
		 int value2=1;
		 int value3=0;
		 double sum=0;
		 System.out.println(value2);
		 for(int index=1;index<20;index++)
		 {
			 value3=value1+value2;
			 sum=+value3;
			 System.out.println(value3);
			 value1=value2;
			 value2=value3;
		 }
		 System.out.println("The average is :  "+sum/20);
		
		}
		
		
	

}
