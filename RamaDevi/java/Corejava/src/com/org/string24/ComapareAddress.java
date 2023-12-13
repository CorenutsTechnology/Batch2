package com.org.string24;

public class ComapareAddress {

	public static void main(String[] args) {
		String one="corenuts";
		String two="corenuts";
		String five="Tehnologies";
		String three=new String("corenuts");
		String four=new String("corenuts");
		String six=new String("Corenuts");
		//Address
		boolean result=(one==two);
		System.out.println(result);
		System.out.println(three==one);
		System.out.println(three==four);
		//Values
		System.out.println(one.equals(two));
		System.out.println(two.equals(five));
		System.out.println(three.equals(four));
		System.out.println(six.equals(four));
	}

}
