package org.december5;

import java.util.Objects;

public class Person implements Comparable<Person>{

	private String name;
	private long phone;

	public Person(String name, long phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [ name=" + name + ", phone=" + phone+" ]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
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
		return Objects.equals(name, other.name) && phone == other.phone;
	}

	@Override
	public int compareTo(Person o) {
		
		return this.getName().compareTo(o.getName());
	}
	
	
	
}
