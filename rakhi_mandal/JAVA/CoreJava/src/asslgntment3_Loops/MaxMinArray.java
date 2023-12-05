package asslgntment3_Loops;

public class MaxMinArray {
	int[] array= {34,5,3,2,303};
	public static void main(String[] args) {
		MaxMinArray maxMinArray =new MaxMinArray();
		maxMinArray.maxValue();
		maxMinArray.minValue();
		
	}
	public void maxValue()
	{
		int max=array[0];
		for(int index=0;index<array.length;index++)
		{
			if(array[index]>max)
			{
				max=array[index];
			}
		}
		System.out.println("Max value in array : "+max);
	}
	public void minValue()
	{
		int min=array[0];
		for(int index=0;index<array.length;index++)
		{
			if(min>array[index])
			{
				min=array[index];
			}
		}
		System.out.println("Min value in array : "+min);
	}
}
