package com.feuji30nov;

import java.util.Comparator;
import java.util.Objects;

public class Student  /*implements Comparator<Student>*/
{
	int sid;
	String sname;
	int sage;
	String address;
	public Student(int sid, String sname, int sage, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", address=" + address + "]";
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
		
	/*@Override
	public int compare(Student student1, Student student2) {
		if(student1.getSage()>student2.getSage())
		return 1;
		else
			return -1;*/
	}
	


