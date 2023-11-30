package exceptionHandling_17_9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		
		  //Input mismatch handling 
			int num1, num2;
			System.out.println("Enter the numbers");
			while (true) {
				try {
					num1 = sc.nextInt();
					num2 = sc.nextInt();
					break;
				}catch (InputMismatchException e) {
					System.out.println("Enter the valid numbers");
					sc.next();
					sc.next();
				} finally {
					System.out.println("Enter the valid numbers");
					
				}
			}
		
		   
		    
		  //ArithmeticException Handling
		   while(true) 
		   { 
		      try { 
		      int result=num1/num2;
		      break; } 
		      catch(ArithmeticException e) {
		  System.out.println("enter a valid input for num2");
		   num2=sc.nextInt(); } }
		  
		  
		 // ArrayIndexOutOfBoundsException Handling 
		  int a[]= {1,2,3,4,5};
		  System.out.println("Enter the index to access");  
		  while(true) { 
		  try { 
		  int k=sc.nextInt(); 
		  System.out.println(a[k]); 
		 
		    //ArithmeticException Handling
		   while(true) 
		   { 
		      try { 
		      int result=num1/num2;
		      break; } 
		      catch(ArithmeticException e) {
		  System.out.println("enter a valid input for num2");
		   num2=sc.nextInt(); } }
		  
		     break;
		  }catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("enter a valid index");
		   int k=sc.nextInt(); } }
		  
		  
	/*
	 * //StringIndexOutOfBoundsException String name=new String();
	 * System.out.println(name.charAt(4));
	 */
		

		// NullPointerException Handling
		String name1 = null;
		//if (name1 != null)
		try {
			System.out.println(name1.charAt(4));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// NumberFormatException
			int k=Integer.parseInt("30P");
			System.out.println(k);
	   
	}
}
