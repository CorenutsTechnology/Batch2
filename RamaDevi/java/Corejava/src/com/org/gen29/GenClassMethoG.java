package com.org.gen29;

public class GenClassMethoG<T> {
	public <T> void calculate(T val1,T val2) 
	{
	System.out.println("Cal "+ Integer.parseInt(val1.toString())+Integer.parseInt(val2.toString()));
	}
	
	public static void main(String[] args) {
		GenClassMethoG<String> genClassMethodG=new GenClassMethoG<>();
		genClassMethodG.<String>calculate("68","10");
	}

}
