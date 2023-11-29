package exception20thnov;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class TestTask extends Super {
	

//	static void m1()throws  ArithmeticException, FileNotFoundException
//	{
//		m2();
//	}
//	static void m2() throws FileNotFoundException
//	{
//		
//	}
//	public static void main(String[] args) {
//	  try {
//		m1();
//	} catch (ArithmeticException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name[]=new String[3];
		System.out.println("enter the login time");

		Double loginTime[]=new Double[name.length];
		
		for(int i=0;i<3;i++)
		{
			name[i]=sc.nextLine();
            loginTime[i]=sc.nextDouble();
		}
		System.out.println("enter your name");
		String name1=sc.next();
		for(int i=0;i<name.length;i++)
		{
			if(name[i].equals(name1))
			{
				System.out.println(name[i]+" login time is "+loginTime[i]);
			}
		}
		
		
		
		
		 
		   
	  
	  
	  	 }

}
