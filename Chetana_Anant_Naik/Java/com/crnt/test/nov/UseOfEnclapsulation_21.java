package com.crnt.test.nov;

public class UseOfEnclapsulation_21 {
	public static void main(String[] args) {
		PojoClass class1 = new PojoClass();
		class1.setId(1000);
		class1.setName("EMP");
		class1.setEmail("emp@12345");

		System.out.println("name is " + class1.getName() + " id " + class1.getId() + " email " + class1.getEmail());
	}
}

class PojoClass {
	private String name;
	private long id;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "PojoClass [name=" + name + ", id=" + id + ", email=" + email + "]";
	}

}
