package day_28_11_23;

public class Person<T> implements Comparable<T> {
	private T name;
	private T location;
	
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getLocation() {
		return location;
	}
	public void setLocation(T location) {
		this.location = location;
	}
	public Person(T name, T location) {
		super();
		this.name = name;
		this.location = location;
	}
	public Person() {
		super();
	}
	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
