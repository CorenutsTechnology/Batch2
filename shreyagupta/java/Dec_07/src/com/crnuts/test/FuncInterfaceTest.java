package com.crnuts.test;

import com.crnuts.Interfaces.FuncInterface;

public class FuncInterfaceTest {

	public static void main(String[] args) {

		FuncInterface funcInterface = (int x) -> System.out.println(5 + x);
		funcInterface.add(9);

	}

}
