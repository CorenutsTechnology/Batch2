package mapinterface_5DEC;

public class Student implements Comparable{

	public String name;
	public int id;
	public String branch;
	
	public Student(String name, int id, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student) o;
	    return this.name.compareTo(s.name);
	}
	
	
}
