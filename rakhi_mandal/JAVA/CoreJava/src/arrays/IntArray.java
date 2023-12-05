//08-11-23
package arrays;

public class IntArray {

	public static void main(String[] args) {
		int[] intArray= new int [5]; //creating a array with 'new'-keyword.
		//Assigning values on the basis of index.
		intArray[0]=2;
		intArray[2]=21;
		intArray[1]=2;
		intArray[3]=22;
		intArray[4]=23;
		System.out.println(intArray[3]); //22
	  //System.out.println(intArray[13]); //ArrayIndexOutOfBoundsException
		
		int intArray1[]= new int [5]; //this syntax is also correct to create a array.
		
		IntArray classObject=new IntArray();
		classObject.values(intArray1);
		
		
		
		
	}
	private void values(int[] intArray1)
	{
		intArray1[0]=10;
		intArray1[2]=11;
		intArray1[1]=12;
		intArray1[3]=13;
		intArray1[4]=14;
		System.out.println(intArray1[3]);
	//	System.out.println(intArray1[5]); //ArrayIndexOutOfBoundsException
	}

}
