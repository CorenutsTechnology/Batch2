package lambda11DEC;

public class Employee {
     
	 int id;
     String name;
     String branch;
	
     public Employee(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
  	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
     
     
     
     
}
