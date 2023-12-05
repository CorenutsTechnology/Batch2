package assignment2;

public class Program4 {
	 static int sum=0;
	public static void main(String[] args) {
		Program4 classObject=new Program4();
//		classObject.intValuesSum();
		int intArray1[]=  {5,6,4,0,9,9}; 
		
		int index=0;
		int result=classObject.withRecurssion(intArray1,3);
		System.out.println(result);
	}
	public void intValuesSum()
	{
		//sum of values in array without loop.
//		int intArray1[]=  {5,6,4,33}; 
//		System.out.println(intArray1[0]+intArray1[1]+intArray1[2]+intArray1[3]);
		
		//Program with  arrayIndexOutOfBound
       //System.out.println(intArray1[8]);
	  
		
		
}
	public int  withRecurssion(int[] intArray1,int index)
	{
		if(index<intArray1.length)
			{
			  sum+=intArray1[index];
//				System.out.println(sum);
				index++;
				return withRecurssion(intArray1, index);
			}
			else return sum;
	
}
}
