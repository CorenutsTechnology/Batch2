package assignment2;

public class Program2 {

	public static void main(String[] args) {
		Program2 classObject=new Program2();
		//way1 to declare a array
		int [] intArray=new int[3];
		classObject.viewValues(intArray);
		
		//way2 to declare a array
		int [] longArray= {56,6,5};
         System.out.println(longArray[1]);
         System.out.println(longArray[2]);
	}
	
	public void viewValues(int [] intArray )
	{
		intArray[1]=89;
		intArray[2]=9;
		 System.out.println(intArray[1]);
         System.out.println(intArray[2]);
	}

}
