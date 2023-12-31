package december14.streams_Student;

import java.util.Comparator;
import java.util.Objects;

public class Employee2 implements Comparable<Employee2>
{
	private Integer empNo;
	private String name;
	private String location;
	public Employee2(Integer empNo, String name, String location) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.location = location;
	}
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empNo, location, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee2 other = (Employee2) obj;
		return Objects.equals(empNo, other.empNo) && Objects.equals(location, other.location)
				&& Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "empNo=" + empNo + ", name=" + name + ", location=" + location;
	}
	@Override
	public int compareTo(Employee2 o) {
		return this.getName().compareTo(o.getName());
		//return this.getLocation().compareTo(o.getLocation());
	}
	
}
