package december8.interfaces;

public class Student
{
	private Integer id;
	private String name;
	private Double marks;
	
	public Student(Integer id , String name, Double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}
	
	public String toString()
	{
		return "Name: "+name+" Id: "+id+" Marks: "+marks;
	}
	
		
}
