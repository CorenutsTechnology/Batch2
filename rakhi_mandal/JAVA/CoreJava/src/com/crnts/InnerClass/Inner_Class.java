package com.crnts.InnerClass;

public class Inner_Class {
	int id=10;
	public static void main(String[] args) {
		Inner_Class innerClass=new Inner_Class();
		innerClass.displayDetails();
	}
	
	void displayDetails()
	{
		Details details =new Details();
		
		System.out.println(details.getName());
		
	}
	
	public class Details
	{
	  private	String name="Rakhi";
	  private	long phone=99988988;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	  
		
	}

}
