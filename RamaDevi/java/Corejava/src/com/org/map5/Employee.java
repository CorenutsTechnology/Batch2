package com.org.map5;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
 String name;
 String location;
public Employee(String name, String location) {
	this.name=name;
	this.location=location;
}
public Employee(String name) {
	this.name=name;
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
public void setAddress(String location) {
	this.location=location;
}
//@Override
//public String toString() {
//	return "Employee [name=" + name + ", location=" + location + ", getName()=" + getName() + ", getLocation()="
//			+ getLocation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
//			+ super.toString() + "]";
//}
@Override
public String toString() {
	return "Employee [name=" + name + ", location=" + location + "]";
}

@Override
public int compareTo(Employee o) {
	return this.name.compareTo(o.name);
}
@Override
public int hashCode() {
	return Objects.hash(name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(name, other.name);
}

//@Override
//public int hashCode() {
//	return Objects.hash(location, name);
//}
//@Override
//public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	Employee other = (Employee) obj;
//	return Objects.equals(location, other.location) && Objects.equals(name, other.name);
//}



}
