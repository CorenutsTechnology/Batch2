package com.crnts.FuntionalInterface;

import java.util.Comparator;

import com.crnts.FunctionalInterfaceAssignment.User;

public class UserComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName() );
	}

}
