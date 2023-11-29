package com.crnt.exception.nov2023;

import java.io.FileInputStream;

public class NestedImpl implements NestedTryStatementsInterface {

	@Override
	public int  function1() {
		
		NestedImpl nestedimpl = new NestedImpl();
		nestedimpl.function2();
		return 0;
	}

	@Override
	public int function2() {
		NestedImpl nestedimpl = new NestedImpl();
		nestedimpl.simpleIntrest(10000, 5, 6);
		return 0;
		
	}

	@Override
	public int simpleIntrest(int p , int r , int t) {
		
		int result1=0;
		
		try {
			int result = (p*r*t)/0;
			try {
				FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\Downloads");
			} catch (Exception e) {
				System.out.println("file not found exception will be handled");
			}
		 }catch (Exception e) {
			System.out.println("Arethmatic excption will be handled");
		}
		
		System.out.println(result1);
		return result1;
		
	}

}
