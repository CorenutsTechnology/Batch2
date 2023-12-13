package streams_13DEC;

public class Student {
    int id;
    String name;
    String branch;
    String gender;
    String city;
    String state;
	
    

	public Student(int id, String name, String branch, String gender, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.gender = gender;
		this.city = city;
		this.state = state;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", gender=" + gender + ", city=" + city
				+ ", state=" + state + "]";
	}

	
    
}
