package com.crnts.constructors.assigmentD23;

public class Program2 {
    int id;
    String name;
    String emailId;
	public Program2() {
		super();
		System.out.println("default");
	}
	public Program2(int id) {
		System.out.println("constructor with 1 arguments");
		this.id = id;
		
	 
	}
	public Program2(int id, String name) {
//		this();
		System.out.println("constructor with 2 arguments");
		this.id = id;
		this.name = name;
	 
	}
	public Program2(int id, String name, String emailId) {
		System.out.println("constructor with 3 arguments");
		this.id = id;
		this.name = name;
		this.emailId = emailId;
	}
	
	public static void main(String[] args) {
		Program2 object1=new Program2();
		System.out.println(object1);
		Program2 object2=new Program2(24);
		System.out.println(object2);
		Program2 object3=new Program2(14,"rakhi");
		System.out.println(object3);
		Program2 object4=new Program2(14,"rakhi","r@gamil.com");
		System.out.println(object4);
		System.out.println("-----------------------");
		Program2 object5=new Program2(88,"jhjh");
		System.out.println(object5);
	}
    
}
