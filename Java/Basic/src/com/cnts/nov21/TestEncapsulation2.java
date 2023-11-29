package com.cnts.nov21;

 class User {

	private int id;                   //As the variable is private it protects the data 
	private String name;              //it enhance security
	private String email;
	private long phone;
	private String password;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

 public class TestEncapsulation2
{
	public static void main(String[] args) {
		User user = new User();
		
		user.setId(1);
		user.setName("Anisha");
		user.setEmail("ani@mail");
		user.setPhone(1234567890);
		user.setPassword("ani123");
		
		//System.out.println("Id: "+id);    
		//we cant directly access the data bcz of encapsulation
		System.out.println("Id: "+user.getId());
		System.out.println("Name: "+user.getName());
		System.out.println("Email: "+user.getEmail());
		System.out.println("Phone number: "+user.getPhone());
		System.out.println("Password: "+user.getPassword());
		}
}