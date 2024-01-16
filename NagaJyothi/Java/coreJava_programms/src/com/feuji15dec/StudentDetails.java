package com.feuji15dec;

public class StudentDetails 
{
	private int sid;
	private String sname;
	private int sage;
	private String add;
	private String sgender;
	public StudentDetails()
	{
		
	}
	public StudentDetails(int sid, String sname, int sage, String add, String sgender) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.add = add;
		this.sgender = sgender;
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
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	@Override
	public String toString() {
		return "StudentDetails [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", add=" + add + ", sgender="
				+ sgender + "]";
	}
	

}
