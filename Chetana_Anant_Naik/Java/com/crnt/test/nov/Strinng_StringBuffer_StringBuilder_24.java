package com.crnt.test.nov;

import java.util.Arrays;

import Interface_Collection.Strinng_StringBuffer_StringBuilder;

public class Strinng_StringBuffer_StringBuilder_24 implements Strinng_StringBuffer_StringBuilder {
	public static void main(String[] args) {
		Strinng_StringBuffer_StringBuilder_24 stringBuffer_StringBuilder_24 = new Strinng_StringBuffer_StringBuilder_24();
		// 1...
//	stringBuffer_StringBuilder_24.StringMethod();
		// 2....
//	stringBuffer_StringBuilder_24.subastringMethod();
		// 3....
//		stringBuffer_StringBuilder_24.equalsMethod();
		//4....
//		stringBuffer_StringBuilder_24.reverseString();
		//5...
//		stringBuffer_StringBuilder_24.reverseWord();
		
		//6....
//		stringBuffer_StringBuilder_24.stringToArray();
		
		//7....
//		stringBuffer_StringBuilder_24.StringBufferMethod();
		
		//9...
//		stringBuffer_StringBuilder_24.addValueInStringBuffer();
		
		//11.....
//		stringBuffer_StringBuilder_24.countTheString();
		
		//12...
		stringBuffer_StringBuilder_24.convertString();
	}

	@Override
	public void StringMethod() {
		String stringArray = "Feuji";
		char[] charArray = stringArray.toCharArray();
		for (int index = 0; index < charArray.length; index++) {
			System.out.println(charArray[index]);
		}

//		System.out.println(Arrays.toString(charArray));
	}

	@Override
	public void subastringMethod() {
		String stringArray = "Corenuts Technologies Pvt Ltd";
		stringArray = stringArray.substring(0, stringArray.indexOf("P"));
		stringArray = stringArray.substring(0, 22);
		System.out.println(stringArray);
	}

	@Override
	public void equalsMethod() {
		String stringArray = new String("Feuji");
		String stringArray1 = new String("Feuji");
		String stringArray3 = "Feuji";
		String stringArray4 = "feuji";
//		System.out.println(stringArray3.equalsIgnoreCase(stringArray4));
		System.out.println(stringArray == stringArray1);
		System.out.println(stringArray.equals(stringArray1));
		System.out.println(stringArray1 == stringArray3);
		System.out.println(stringArray3.equals(stringArray1));
		System.out.println(stringArray.equals(stringArray1));
		System.out.println(stringArray3 == stringArray4);
		System.out.println(stringArray3.equals(stringArray4));
//		System.out.println(stringArray.toString()=stringArray1.toString());

	}

	@Override
	public void reverseString() {
		String stringArray = "Corenuts Technologies Pvt Ltd";
		char[] charArray = stringArray.toCharArray();
		for (int index = charArray.length-1; index >=0 ; index--) {
			System.out.println(charArray[index]);
		}

	}

	@Override
	public void reverseWord() {
		String stringArray = "Corenuts Technologies Pvt Ltd";
		String[] stringArray1=stringArray.split(" ");
		for (int index =stringArray1.length-1; index >=0 ; index--) {
			System.out.print(stringArray1[index]+" ");
		}

	}

	@Override
	public void stringToArray() {
		String stringArray = "Corenuts Technologies Pvt Ltd";
		String[] stringArray1=stringArray.split(" ");
		for (int index =0; index<stringArray1.length ; index++) {
			System.out.print(stringArray1[index]+" ");
		}

		
	}

	@Override
	public void StringBufferMethod() {
		StringBuffer buffer=new StringBuffer("Corenuts Technologies Pvt Ltd");
		System.out.println(buffer.delete(9,22));
		System.out.println(buffer.delete(buffer.indexOf("s"), buffer.indexOf(" ")));
	}

	@Override
	public void addValueInStringBuffer() {
		StringBuffer buffer=new StringBuffer("Corenuts Pvt Ltd");
		System.out.println(buffer.insert(buffer.indexOf(" "), " Technologies"));
	}

	@Override
	public void countTheString() {
		String stringValue="corenutstechnologiespvtltd";
		char[] stringvalue1=stringValue.toCharArray();
		int[] repeat=new int[stringValue.length()];
		
		for(int index=0;index<stringvalue1.length;index++){
			int count=1;
			for(int index1=index+1;index1<stringvalue1.length;index1++){
				if(stringvalue1[index]==stringvalue1[index1]) {
					repeat[index1]=-1;
					count++;
				}
			}
			if(repeat[index]!=-1) {
				repeat[index]=count;
			}
		}
		
		for(int index=0;index<stringvalue1.length;index++){
			if(repeat[index]!=-1) {
				System.out.println(stringvalue1[index]+" "+repeat[index]);
			}
		}
	}

	@Override
	public void convertString() {
		int intvalue=14;
		System.out.println(intvalue+13);
		String stringvalue=String.valueOf(intvalue);
		System.out.println(stringvalue+13);
		
		
		char charvalue='c';
		System.out.println(charvalue+'c');
		System.out.println(charvalue+0);
		System.out.println(charvalue);
		String stringvalue1=String.valueOf(charvalue);
		System.out.println(stringvalue1+'c'+1);
		

		boolean booleanValue=true;
		System.out.println(booleanValue);
		String stringvalue2=String.valueOf(booleanValue);
		System.out.println(stringvalue2+true);
		
	}
}

//class DemoString extends StringBu {
//	
//}
