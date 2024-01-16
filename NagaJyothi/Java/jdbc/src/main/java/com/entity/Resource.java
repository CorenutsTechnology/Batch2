package com.entity;

import java.util.Date;

public class Resource 
{
	private int id;
	private String name;
	private String location;
	private int code;
	private Date date;
	public Resource()
	{
		
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Resource(int id, String name, String location, int code) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.code = code;
	}
	public Resource(int id, String name, String location, int code, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.code = code;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Resource [id=" + id + ", name=" + name + ", location=" + location + ", code=" + code + ", date=" + date
				+ "]";
	}
	

}
