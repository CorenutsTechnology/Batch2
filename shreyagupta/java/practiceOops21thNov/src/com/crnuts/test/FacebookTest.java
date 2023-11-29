package com.crnuts.test;

import com.crnuts.impleClass.Facebook;
import com.crnuts.impleClass.LoginFb;

public class FacebookTest {

	public static void main(String[] args) {
		
		Facebook fb = new LoginFb(345, "Shreya Gupta", "shreya@gmail.com", "shreya765");
		
		LoginFb loginFb = new LoginFb(fb.getFbId(), fb.getName(), fb.getEmail(), fb.getPassward());
		
		System.out.println("ID and Passward for user " + fb.getName() + " in facebook.");
		
		System.out.println("ID: " + fb.getFbId() + "\n" + "Passward: " + fb.getPassward());
		
		fb.setFbId(875);
		System.out.println("Added new ID in facebook: " + fb.getFbId());

		System.out.println("-----------Method overloading-------------------");
		System.out.println("We can login fb throuth 2 ways.");

		loginFb.loginWays(fb.getFbId(), fb.getPassward());
		loginFb.loginWays(fb.getEmail(), fb.getPassward());
	}
}
