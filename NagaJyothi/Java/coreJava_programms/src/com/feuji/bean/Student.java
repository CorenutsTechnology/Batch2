package com.feuji.bean;

public class Student {
private int rollNo;
private String add;
private String name;
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", add=" + add + ", name=" + name + "]";
}

}
