package assignment4_Loops;

import java.util.Random;

public class RandomInfiniteLoop {

	public static void main(String[] args) {
		Random random=new Random();
		int [] array=new int[25];
		while(true)
		{
		for(int index=0;index<25;index++)
		{  
			array[index]=random.nextInt(100);
			System.out.println(array[index]);
		}
		System.out.println("---------------------------");
		for(int index=0;index<25;index++)
		{ 
	       if(array[1]>array[index])
	    	   System.out.println( array[index]+" Smaller than :" +array[1]);
	       
	       else if(array[1]<array[index])
	    	   System.out.println(array[index]+" Greater than :" +array[1]);
	       else
	    	   System.out.println(array[index]+" Equal to :" +array[1]);
		}
		
	}
	}
}
