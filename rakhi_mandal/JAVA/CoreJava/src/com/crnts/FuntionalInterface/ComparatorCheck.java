package com.crnts.FuntionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.crnts.List.User;

public class ComparatorCheck {

	public static void main(String[] args) {
		ComparatorCheck comparatorCheck=new ComparatorCheck();
		comparatorCheck.sortById();
		comparatorCheck.sortByName();
	}
	
	void sortById() {
		List<User> list = new ArrayList<>();
		list.add(new User(1, "rakhi", 2002));
		list.add(new User(12, "neha", 2018));
		list.add(new User(3, "tom", 2008));
		list.add(new User(14, "abhi", 2006));
		Comparator c = (o1, o2) -> {
			return ((User) o1).getUserId() - ((User) o2).getUserId();
		};
	
		Collections.sort(list, c);
		Collections.sort(list,(User o1,User o2) -> {
			return o1.getUserId() -o2.getUserId();
		});
		
		
		
		
		
		
		System.out.println(list);

	}
	void sortByName() {
		List<User> list = new ArrayList<>();
		list.add(new User(1, "rakhi", 2002));
		list.add(new User(12, "neha", 2018));
		list.add(new User(3, "tom", 2008));
		list.add(new User(14, "abhi", 2006));
		Comparator c1 = (o1, o2) -> {
			return ((User) o1).getName().compareToIgnoreCase(((User) o2).getName());
		};

		Collections.sort(list, c1);
		System.out.println(list);

	}
}
