package com.crnuts.test;

import com.crnuts.classes.Employee;
import com.crnuts.classes.ImplRunable_Q2;

public class ImplRunableTest_Q2 {

	public static void main(String[] args) {

		ImplRunable_Q2 implRunable1 = new ImplRunable_Q2();
		ImplRunable_Q2 implRunable2 = new ImplRunable_Q2();
		ImplRunable_Q2 implRunable3 = new ImplRunable_Q2();

		new Thread(implRunable1).start();
		new Thread(implRunable2).start();
		new Thread(implRunable3).start();

	}

}
