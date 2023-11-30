package exceptionHandling_17_9;

import java.util.Scanner;

public class SingleCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      try {
		int num1, num2;
		System.out.println("Enter the numbers");
		num1 = sc.nextInt();
		
		String name1 = null;
		System.out.println(name1.charAt(4));
        
		int k=Integer.parseInt("30P");
		System.out.println(k);
      }catch(ArithmeticException|NullPointerException e1){
    	  System.out.println(e1);
    	  return;
      
      }/*catch(ArithmeticException e)
      }
      {
    	System.out.println(e);  
      }
      catch(RuntimeException e)
      {
    	  System.out.println(e);
      }*/
      catch(Exception e)
      {
    	  System.out.println(e.getMessage());
      }
      finally {
      System.out.println("All exceptions are handled");
      }
    
      
	}
}
