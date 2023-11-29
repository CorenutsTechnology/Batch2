package com.crnt.nov0823;

public class StringArray {
	public static void main(String[] args) {
		StringArray.test();
		
	}

	private static void test() {
		String[] value = new String[5];
		
		value[0]="vijayawada";
		value[1]="machilipatnam";
		value[2]="hyderabad";
		value[3]="tirupati";
		System.out.println(value[0]);
		System.out.println(value[3]);
		System.out.println(value.length);
		System.out.println("anonymous string address: "+new String[] {"sri","civil","vij"});
		System.out.println("anonymous string length: "+new String[] {"sri","civil","vij"}.length);
		System.out.println("anonymous string value : "+new String[] {"sri","civil","vij"}[2]);
		
	}

}
