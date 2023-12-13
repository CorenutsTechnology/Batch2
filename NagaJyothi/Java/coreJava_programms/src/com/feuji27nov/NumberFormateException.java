package com.feuji27nov;

public class NumberFormateException {
	public static void main(String[] args) {
		// we will give out of range value we will get numberformate exception.

		String value = "1234";
		Byte byteValue = Byte.parseByte(value);
		System.out.println("byte value:" + byteValue);

		String value1 = "52345";
		Short shortValue = Short.parseShort(value1);
		System.out.println("Short value:" + shortValue);
		String value2 = "ten";
		Integer intValue = Integer.parseInt(value);
		System.out.println(intValue);

		NumberFormateException result = new NumberFormateException();
		try {
			result.CheckNumber("123jyk");

		} catch (NumberFormatException e) {
			System.out.println("exception occured");
			System.out.println("Not a number");
		}

	}

	public void CheckNumber(String name) {
		int num = Integer.parseInt(name);
		if (num > 0) {
			System.out.println("number" + num);
		} else {
			System.out.println("not a number");
		}
	}

}
