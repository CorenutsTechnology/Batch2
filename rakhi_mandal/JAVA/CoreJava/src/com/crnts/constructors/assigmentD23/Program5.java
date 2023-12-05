package com.crnts.constructors.assigmentD23;

public class Program5 {
	
	static int id;
	static String name;
	 String email;
	

	public Program5(int id,String name,String email) {
		super();
		this.email = email;
		this.name = name;
		this.id = id;
	}


	public static void main(String[] args) {
		Program5 program5 = new Program5(23,"rakhi","r@gmail.com");
		System.out.println(program5.id);
	}

}
