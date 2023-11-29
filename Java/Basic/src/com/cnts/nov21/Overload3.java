package com.cnts.nov21;

public class Overload3 {
public void verify(int id,String password)
{
	System.out.println("User is verifyed by uderId and User Password");
	System.out.println("UserId: "+id);
	System.out.println("Password: "+password);
	System.out.println();
}

public void verify(String username,String password)
{
	System.out.println("User is verifyed by username and User Password");
	System.out.println("UserName: "+username);
	System.out.println("Password: "+password);
	System.out.println();
}

public void verify(long phone,String password)
{
	System.out.println("User is verifyed by userPhoneNumber and User Password");
	System.out.println("UserPhoneNumber: "+phone);
	System.out.println("Password: "+password);
	System.out.println();
}
/*  
 * Method overloading can make your code more flexible 
 * by allowing you to call the same method with different parameters.
 * 
 * Method overloading can help you to reduce code duplication 
 * by allowing you to define a single method that can be used for different purposes
 * */
public static void main(String[] args) {
	Overload3 load = new Overload3();
	load.verify(1, "password");
	load.verify("anisha", "password");
	load.verify(1234567890, "password");
}
}


