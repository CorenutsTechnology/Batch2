//Write a program to sort an array list elements using comparable, comparator Interfaces?
package com.crnts.List;

public class User /*implements Comparable<User>*/{
	private int userId;
	private String name;
	private int joinDate;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(int joinDate) {
		this.joinDate = joinDate;
	}

	public User(int userId, String name, int joinDate) {
		super();
		this.userId = userId;
		this.name = name;
		this.joinDate = joinDate;
	}
	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", joinDate=" + joinDate + "]";
	}

//	@Override
//	public int compareTo(User u) {
//		int date=Integer.valueOf(this.joinDate).compareTo(u.getJoinDate());
//		if(date==1)
//		{
//			return -1;
//		}
//		if(date==-1)
//		{
//			return 1;
//		}
//		return 0;
//	}

}
