package assignment2;

public class FindMaxInArray {

	public static void main(String[] args) {
		
		FindMaxInArray findMaxInArray= new FindMaxInArray();
		findMaxInArray.maxValue();
	}
	public void maxValue()
	{
		int[] array= {34,5,3,2,303};
		int max=array[0];
		for(int index=0;index<array.length;index++)
		{
			if(array[index]>max)
			{
				max=array[index];
			}
		}
		System.out.println(max);
	}

}
