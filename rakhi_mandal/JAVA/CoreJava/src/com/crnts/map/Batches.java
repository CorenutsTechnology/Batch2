package com.crnts.map;

import java.util.Objects;

public class Batches {
	private int id;
	private String name;
	private String batchName;
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
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public Batches(int id, String name, String batchName) {
		super();
		this.id = id;
		this.name = name;
		this.batchName = batchName;
	}
	public Batches() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(batchName, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batches other = (Batches) obj;
		return Objects.equals(batchName, other.batchName) && id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Batches [id=" + id + ", name=" + name + ", batchName=" + batchName + "]";
	}
	
}
