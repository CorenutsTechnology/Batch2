package day_15_11_23;

import day_15_11_23_Assignment.DefaultAndProtected;

public class AccessDefaultAndProtected extends DefaultAndProtected {

	public static void main(String[] args) {
		AccessDefaultAndProtected modifier=new AccessDefaultAndProtected();
		System.out.println(modifier.protectedValue);
	}

}
