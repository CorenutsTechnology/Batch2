package constractor;

public class Student1 {
	String Stringname="";
	public Student1( String Stringname) {
		this.Stringname=Stringname;
	}
	
	public Student1( ) {
		this.Stringname="Unknow";
	}
	public static  void main(String args[]) {
	Student1 student=new Student1("kalyani");
	Student1 student1=new Student1();
	System.out.println(student.Stringname);
	System.out.println(student1.Stringname);
}
}
