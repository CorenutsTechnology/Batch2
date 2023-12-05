package com.crnts.List;

import java.util.Comparator;

public class ComparatorClass implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getUserId()-o2.getUserId();
	}

}

