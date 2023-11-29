package com.cnts.nov23;

class Verification
{
	int id;
	String password;
	long phone;
	String email;
	
	public Verification() {
		System.out.println("no parameter constructor");
	}
	
	public Verification(int id, String password) {
		this.id=id;
		this.password=password;
		System.out.println("User Verification.. by id and password " +this.id+" "+this.password);
	}
	
	public Verification(long phone,String password)
	{
		this.phone=phone;
		this.password=password;
		System.out.println("User Verification.. by phone number and password "+this.phone+" "+this.password);
	}
	
	public Verification(String email,String password)
	{
		this();
		this.email=email;
		this.password=password;
		System.out.println("User Verification.. by email and password "+this.email+" "+this.password);
	}
}
public class ConstructorOverloading3 {

	public static void main(String[] args) {
//		Verification verifi = new Verification();
		Verification verifi1 = new Verification(1, "password");
		Verification verifi2 = new Verification(123456789l, "password");
		Verification verifi3 = new Verification("ani@gmail.com", "password");
	}
}
