package com.org.gen29;

public class GenericMethod {
public <T>void calculate(T arg1,T arg2)
{
	System.out.println("ARg in method "+(Double.parseDouble(arg1.toString())+Double.parseDouble(arg2.toString())));
}
public static void main(String[] args) {
	GenericMethod generic=new GenericMethod();
	generic.<Double>calculate(19.9,977.0);
}
}
