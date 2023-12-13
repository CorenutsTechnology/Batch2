package com.org.MethodRef11;

import java.util.Objects;

public class Student implements Comparable<Student> {
 int id;
 String name;
public Student(int id, String name) {
	this.id=id;
	this.name=name;
	}
public Student() {
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

@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return id == other.id;
}

@Override
public String toString() {
	return "Student [id=" + id + "]";
}
@Override
public int compareTo(Student o) {
	if(this.id==o.id)
		return 0;
	if(this.id>o.id)
		return 1;
	else
		return -1;
}

}
