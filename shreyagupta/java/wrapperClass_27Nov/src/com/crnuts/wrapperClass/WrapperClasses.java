package com.crnuts.wrapperClass;

public class WrapperClasses {

	public static void main(String[] args) {
		System.out.println("-----------Ques:1,7 & 8------------");

		Integer demo1 = 100;
		Integer demo2 = 397;
		

		System.out.println("compairing hashCode through equals() method: " + demo1.equals(demo2));
		System.out.println("toString() method is overridden in wrapper class." + "\n" + demo2.toString());

		int value2 = Integer.parseInt("874");
		System.out.println("converted String to int using parseInt(): " + value2);

		Integer integer1 = Integer.valueOf("3566");
		// "All calls to a constructor of a primitive type will be replaced by "
		// the corresponding static valueOf() method.
		// "For example new Integer("1")becomes Integer.valueOf("1")

		System.out.println("-----------Ques:2------------");
		System.out.println("auto-boxing");
		short num1 = Short.valueOf("53");
		System.out.println("short primitive type to Short wrapper class: " + num1);
		char character = Character.valueOf('t');
		System.out.println("char primitive type to Character wrapper class: " + character + "\n");

		System.out.println("-----------Ques:3------------");
		double d = Double.parseDouble("55.467");
		System.out.println("converted Double to double using parseDouble(): " + d + "\n");

		System.out.println("-----------Ques:4------------");

		// Integer integer= Integer.valueOf("hgfhdg");// NumberFormatException
		System.out.println("Integer integer= Integer.valueOf(\"hgfhdg\"); // NumberFormatException" + "\n");
		
		

	}

}
