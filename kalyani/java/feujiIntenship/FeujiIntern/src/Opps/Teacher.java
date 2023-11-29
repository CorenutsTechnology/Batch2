package Opps;

public class Teacher  extends Student1{

	
	
	public Teacher(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Student1 teacher=new Student1("kalyani", 1);
		 System.out.println(teacher.getName());
		 System.out.println(teacher.getId());
	}

}
