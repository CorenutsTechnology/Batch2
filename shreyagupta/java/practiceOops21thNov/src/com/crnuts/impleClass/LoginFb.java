package com.crnuts.impleClass;

public class LoginFb extends Facebook {

	
	public LoginFb(int fbId, String name, String email, String passward) {
		super(fbId, name, email, passward);

	}

	public void loginWays(String email, String passward) {
		System.out.println("We can login fb is through email and passward.");
	}

	public void loginWays(int fbId, String passward) {
		System.out.println("We can login fb is through fackbook ID and passward.");
	}

}
