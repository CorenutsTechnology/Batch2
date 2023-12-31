//3.Write a program which demonstrates constructor overloading?

package com.constructors.nov23;

public class Registration3 
{
	String email;
	String password;
	long phone;
	public Registration3(String email , String password)
	{
		this.email =email;
		this.password=password;
	}
	public Registration3(long phone , String password)
	{
		this.phone = phone;
		this.password=password;
	}
	public void display()
	{
		System.out.println("Email: "+email+"\nPhone :"+phone+"\nPassword: "+password);
	}
	public static void main(String[] args) 
	{
		System.out.println("Registration using email and password");
		Registration3 registration1 = new Registration3("pravali@gmail.com" ,"pravali@123");
		registration1.display();
		System.out.println("\nRegistration using phone and password");
		Registration3 registration2 = new Registration3(6302818639l ,"pravali@098");
		registration2.display();
	}

}
