package day_23_11_23_Assignment;

public class Q1_Student {
	
	String name;

	public Q1_Student() {
		super();
		this.name="unknown";
	}

	public Q1_Student(String name) {
		super();
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Q1_Student student=new Q1_Student();
		
//		student=new Q1_Student("vaishali");
		
		System.out.println(student.name);
	}
}
