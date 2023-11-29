package com.ass.tenNov;


//RECURSION
public class ArrayElementsSum {
	public static void main(String[] args) {
		
		int[] integerArray= {3,1,2,4};
		int sum=0;
		int index=0;
		ArrayElementsSum sumOfTheArrayElement= new ArrayElementsSum();
		sumOfTheArrayElement.addElements(integerArray, index, sum);
		
		
	}
	
	public int addElements(int[] integerArray,int index,int sum) {
		
		sum=sum+integerArray[index];
		index++;
		if(index==integerArray.length) {
			System.out.println("sum of array elements: "+sum);
			return sum;
		}
		return addElements(integerArray, index, sum);
		
		
		
	}
		
		
//	
//    int sumOfArray=0;
//	
//	int[] integerArray=new int[3];
//	
//	integerArray[0]=10;
//	integerArray[1]=20;
//	integerArray[2]=30;
//	
//	sumOfArray = integerArray[0]+integerArray[1]+integerArray[2];
//	System.out.println("sum of array:"+sumOfArray);
//	


}
