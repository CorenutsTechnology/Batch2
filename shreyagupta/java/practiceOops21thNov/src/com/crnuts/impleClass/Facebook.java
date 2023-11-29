package com.crnuts.impleClass;

public class Facebook {

	// ques-encapsulation, method overloading, ques 6

	private int fbId;
	private String name;
	private String email;
	private String passward;

	public Facebook(int fbId, String name, String email, String passward) {

		this.fbId = fbId;
		this.name = name;
		this.email = email;
		this.passward = passward;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFbId() {
		return fbId;
	}

	public void setFbId(int fbId) {
		this.fbId = fbId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

}
