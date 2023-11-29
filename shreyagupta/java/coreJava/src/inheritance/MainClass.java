package inheritance;

public class MainClass {

	public static void main(String[] args) {
		Employees e1=new Employees();
		Company c=new Company();
		e1.cname();
		System.out.println(Employees.ename);
		System.out.println(e1.eid);
		System.out.println(e1.ephno);
		

	}

}
