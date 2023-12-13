package com.org.exception17;


public class ExeceptionUseTryCatch {
public void exception()
	{
	System.out.println("******");
     int intValue=10;
     try
     {
    	 System.out.println("try start");
    	 int result=intValue/0;
    	 System.out.println("try end");
     }
    
     catch(Exception e)
     {
	System.out.println("Exception occured");
     }
//     finally
//     {
//    	System.out.println("finally"); 
//     }
     System.out.println("*******");
	}
public static void main(String[] args) {
	ExeceptionUseTryCatch execeptionUseTryCatch =new ExeceptionUseTryCatch ();
	execeptionUseTryCatch.exception();
}
}