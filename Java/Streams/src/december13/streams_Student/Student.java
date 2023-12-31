package december13.streams_Student;

import java.util.Objects;

public class Student
{
	private Integer id;
	private String name;
	private Character gender;
	private String dept;
	private Integer address;
	private String city;
	private String state;
	
	public Student(Integer id , String name , Character gender, String dept ,Integer address, String city,String state)
	{
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.dept=dept;
		this.address=address;
		this.city=city;
		this.state=state;
	}
	
	public String toString()
	{
		return "id: "+id+" name: "+name+" gender: "+gender+" dept: "+dept+" address: "+address+" city: "+city+" state: "+state;
	}
	
	public void setId(Integer id)
	{
		this.id=id;
	}
	public Integer getId()
	{
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void setAddress(Integer address)
	{
		this.address=address;
	}
	
	public Integer getAddress()
	{
		return address;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(city, dept, gender, id, name, state);
	}


	
	@Override
	public boolean equals(Object obj)
	{	
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Student student = (Student)obj;
		return Objects.equals(this.name,student.name)&&Objects.equals(this.id,student.id)&&Objects.equals(this.gender,student.gender) && 
				Objects.equals(this.dept,student.dept) && Objects.equals(this.city,student.city) && Objects.equals(this.state,student.state);
	}
		
}
