 //Declare array with all data types and print the values without using loop
package com.arrays.nov8;
public class ArrayWithAllDataTypes1 {

	int index=0;
	
	void printByteArray(byte[] byteArray) 
	{
		if(index<byteArray.length)
		{
			System.out.print(byteArray[index++]+" ");
			printByteArray(byteArray);
		}
		else {
			index=0;
			System.out.println();
		}
	}

	void printShortArray(short[] shortArray) 
	{
		if(index<shortArray.length)
		{
			System.out.print(shortArray[index++]+" ");
			printShortArray(shortArray);
		}
		else {
			index=0;
			System.out.println();
		}
	}
	
	void printIntArray(int[] intArray) 
	{
		if(index<intArray.length)
		{
			System.out.print(intArray[index++]+" ");
			printIntArray(intArray);
		}
		else {
			index=0;
			System.out.println();
		}
	}
	
	void printLongArray(long[] byteArray) 
	{
		if(index<byteArray.length)
		{
			System.out.print(byteArray[index++]+" ");
			printLongArray(byteArray);
		}
		else {
			index=0;
			System.out.println();
		}
	}
	
	void printCharArray(char[] charArray) 
	{
		if(index<charArray.length)
		{
			System.out.print(charArray[index++]+" ");
			printCharArray(charArray);
		}
		else {
			index=0;
			System.out.println();
		}
	}
	
	void printBooleanArray(boolean[] booleanArray) 
	{
		if(index<booleanArray.length)
		{
			System.out.print(booleanArray[index++]+" ");
			printBooleanArray(booleanArray);
		}
		else {
			index=0;
			System.out.println();
		}
	}
	
	void printFloatArray(float[] floatArray) 
	{
		if(index<floatArray.length)
		{
			System.out.print(floatArray[index++]+" ");
			printFloatArray(floatArray);
		}
		else {
			index=0;
			System.out.println();
		}
	}
	
	void printDoubleArray(double[] doubleArray) 
	{
		if(index<doubleArray.length)
		{
			System.out.print(doubleArray[index++]+" ");
			printDoubleArray(doubleArray);
		}
		else {
			index=0;
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) 
	{
		byte[] byteArray = {(byte) 129,2,3,4};
		short[] shortArray = {5,6,7,8};
		int[] intArray = {9,10,11,12};
		long[] longArray = {101,102,103,104};
		char[] charArray = {'a','b','c','d'};
		boolean[] booleanArray= {true ,false,false ,true};
		double[] doubleArray = {10.9 ,23.3, 12.34, 34.56};
		float[] floatArray = {1.0f , 2.3f, 4.5f,6.445f};
		
		//printing values of all arrays without using loops
		
//		System.out.println("byte array: "+Arrays.toString(byteArray));
//		System.out.println("short array: "+Arrays.toString(shortArray));
//		System.out.println("int array: "+Arrays.toString(intArray));
//		System.out.println("long array: "+Arrays.toString(longArray));
//		System.out.println("double array: "+Arrays.toString(doubleArray));
//		System.out.println("float array: "+Arrays.toString(floatArray));
//		System.out.println("char array: "+Arrays.toString(charArray));
//		System.out.println("boolean array: "+Arrays.toString(booleanArray));
		
		ArrayWithAllDataTypes1 object = new ArrayWithAllDataTypes1();
		System.out.println("byte array values are:");
		object.printByteArray(byteArray);
		
		System.out.println("short array values are:");
		object.printShortArray(shortArray);
		
		System.out.println("int array values are:");
		object.printIntArray(intArray);
		
		System.out.println("long array values are:");
		object.printLongArray(longArray);
		
		System.out.println("character array values are:");
		object.printCharArray(charArray);
		
		System.out.println("boolean array values are:");
		object.printBooleanArray(booleanArray);
		
		System.out.println("float array values are:");
		object.printFloatArray(floatArray);
		
		System.out.println("double array values are:");
		object.printDoubleArray(doubleArray);
		
	}

	
}
