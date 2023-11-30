package day_23_11_23_Assignment;

public class Q3_Employee {
	private String name;
	private int age;
	private long phone;
	
	public Q3_Employee() {
		super();
		System.out.println("constructor without arguments");
	}

	public Q3_Employee(String name) {
		super();
		this.name = name;
		System.out.println("name"+name);
		System.out.println("constructor with one argument");
	}

	public Q3_Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("name : "+name+"\n"+"age : "+age);
		System.out.println("constructor with two arguments");
	}

	public Q3_Employee(String name, int age, long phone) {
//		super();
		this(name,age );
		this.name = name;
		this.age = age;
		this.phone = phone;
		System.out.println("phone"+phone);
		System.out.println("constructor with arguments");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
}
