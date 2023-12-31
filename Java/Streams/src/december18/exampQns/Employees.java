package december18.exampQns;

public class Employees {
	private int id;
	private String name;
	private Double salary;
	private int deptId;
	public Employees(int id, String name, int deptId, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptId=deptId;
	}
	
	
	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


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


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salary=" + salary + ", deptId=" + deptId + "]";
	}



	
	
}
