package assignment2;

public class Program3 {
 public static void main(String[] args) {
//		int [] intArray=new int[-3];
//		intArray[-1]=89;
//		intArray[-2]=9;
		
//	Runtime Exception --NegativeArraySizeException

// Program 6-Declare array without giving size.CTE
//		int [] intArray=new int[];
		
		int [] intArray1= {8,9,9,8,99};
		Program3 classObject=new  Program3();
		classObject.viewValues(intArray1);
}
 
 public void viewValues(int [] intArray1 )
	{
		intArray1[1]=89;
		intArray1[2]=9;
		 System.out.println(intArray1[1]);
      System.out.println(intArray1[2]);
	}
}
