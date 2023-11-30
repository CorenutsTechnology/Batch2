package oops_23_11;

public class Student {

	//if try to intialize the static variable using constructor the last assigned value is reflected in all objects
	private int id;
	private static String name;
	private char gender;
	
	public Student() {
	
		this.name="unknown";
	}

	
	public Student(int id) {
	
		this.id = id;
	}


	public Student(String name) {
		this.name = name;
	}
	
	
	public Student(int id, String name, char gender) {
		this(id);
		this.name = name;
		this.gender = gender;
	}

	public static void run()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Student []names=new Student[] {  new Student("jyothi"),
				new Student("sapnika"),new Student(),new Student("raji"),
				new Student("rama")
				
		};
		
		for(Student i:names)
		{
			System.out.println(i.name);
		}
	}
	
}
