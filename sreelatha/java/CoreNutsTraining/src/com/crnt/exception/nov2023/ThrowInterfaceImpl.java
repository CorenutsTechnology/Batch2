package com.crnt.exception.nov2023;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowInterfaceImpl implements ThrowInterface{
	
	@Override
	public int function1() {
		ThrowInterfaceImpl throwInterfaceImpl = new ThrowInterfaceImpl();

		System.out.println("calling function 2");
		
		throwInterfaceImpl.function2(null);
		
		
		
		
		System.out.println("called fucntion 2");
		return 0;
	}

	@Override
	public int function2(int [] a)  {
		ThrowInterfaceImpl throwInterfaceImpl = new ThrowInterfaceImpl();
		int result = a.length;
		System.out.println(result);

		System.out.println("calling calcute ");
		
		
	throwInterfaceImpl.calculate(3,4,9);
		System.out.println("called calculate");
		return 0;		
	}

	@Override
	public int calculate(int i, int j, int k)  {
		System.out.println("called calculate with arg");
		int result = (i/j)/k;
		System.out.println("result : "+result);
		try {
			
			
			FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\Downloads");
			//throw new RuntimeException("file not found");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			throw new RuntimeException("file not found");
		}
		return result;
		
		
	}

	

}
