package com.org.Collection4;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
int age;
String name;
public Student(int age, String name) {
	this.age=age;
	this.name=name;
}
public Student() {
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [age=" + age + ", name=" + name + "]";
}
@Override
public int hashCode() {
	System.out.println("hash code");
	return 1;
	//return Objects.hash(age, name);
}
@Override
public boolean equals(Object obj) {
	System.out.println("equals");
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return age == other.age && Objects.equals(name, other.name);
	//return true;
}
@Override
public int compareTo(Student o) {
	return 0;
}



}
