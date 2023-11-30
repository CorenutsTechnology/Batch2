package day_14_11_23_Assignment;

import java.util.Random;

public class RandomIntValues {

	public void compare(int intArray[]) {
		for (int index = 0; index < intArray.length; index++) {
			if(intArray[index]>intArray[1]) {
				System.out.println(intArray[index]+" is greater than "+intArray[1]);
			}
			else if(intArray[index]<intArray[1]) {
				System.out.println(intArray[index]+" is less than "+intArray[1]);
			}
			else {
				System.out.println(intArray[index]+" is equal to "+intArray[1]);
			}
		}
	}
	
	public static void main(String[] args) {
		Random random=new Random();
		
		int intArray[]=new int[25];
		
		for(int index=0;index<intArray.length;index++) {
			intArray[index]=random.nextInt(10000);
		}
		
		for (int index = 0; index < intArray.length; index++) {
			System.out.print(intArray[index]+" ");
		}
		
		System.out.println();
		
		RandomIntValues values=new RandomIntValues();
		values.compare(intArray);
	}

}
