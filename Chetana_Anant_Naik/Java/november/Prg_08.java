package november;

import java.util.Arrays;

public class Prg_08 {
public static void main(String[] args) {
    Prg_08 prg_08 =new Prg_08();
//	prg_08.asgn1();
//	prg_08.asgn2();
	//prg_08.asgn3();
//	prg_08.asgn4();
	//prg_08.asgn5();
	prg_08.asgn6();
//	prg_08.asgn7();
}

private void asgn7() {
	// TODO Auto-generated method stub
	char[] charArray= {'C','H','E','T','A','N','A'};
	 
System.out.println(charArray[0]+""+ charArray[1]+""+ charArray[2]+""+ charArray[3]+""+ charArray[4]+""+ charArray[5]+""+ charArray[6]);
}

private  void asgn6() {
	// TODO Auto-generated method stub
	int[] intArray =new int[5];
	System.out.println(Arrays.toString(intArray));
	char[] charArray=new char[5];
	System.out.println(Arrays.toString(charArray));
}

private void asgn5() {
	// TODO Auto-generated method stub
	char[] charArray= {'A','B','C','D'};
	System.out.println(charArray[5]);//ArrayIndexOutOfBoundsException
}

private void asgn4() {
	// TODO Auto-generated method stub
	int[] intArray= {2,4,6,8,10};
	System.out.println(intArray[0]+intArray[1]+intArray[2]+intArray[3]+intArray[4]);
	
	
}

private  void asgn2() {
	// TODO Auto-generated method stub
	int[] intArray =new int[5];
	System.out.println(Arrays.toString(intArray));
	
	 char[] charArray= {'A','B','C','D'};
	 System.out.println(Arrays.toString(charArray));
}

private  void asgn3() {
	// TODO Auto-generated method stub
int[] intArray=new int[-8];// if we try to put negative size in array we get NegativeArraySizeException 
	
	System.out.println(Arrays.toString(intArray));
}

private  void asgn1() {
	// TODO Auto-generated method stub
	short[] shortArray= {1,2,3,4,5};
	System.out.println(shortArray[0]);
	System.out.println(shortArray[1]);
	System.out.println(shortArray[2]);
	System.out.println(shortArray[3]);
	System.out.println(shortArray[4]);
	System.out.println(Arrays.toString(shortArray));	
	
	int[] intArray= {1,2,3,4,5};
	System.out.println(intArray[0]);
	System.out.println(intArray[1]);
	System.out.println(intArray[2]);
	System.out.println(intArray[3]);
	System.out.println(intArray[4]);
	System.out.println(Arrays.toString(intArray));
	
	byte[] byteArray= {1,2,3,4,5};
	System.out.println(byteArray[0]);
	System.out.println(byteArray[1]);
	System.out.println(byteArray[2]);
	System.out.println(byteArray[3]);
	System.out.println(byteArray[4]);
	System.out.println(Arrays.toString(byteArray));	
	
	long[] longArray= {1000000,200000,300000,400000,500000};
	System.out.println(longArray[0]);
	System.out.println(longArray[1]);
	System.out.println(longArray[2]);
	System.out.println(longArray[3]);
	System.out.println(longArray[4]);
	System.out.println(Arrays.toString(longArray));	
	
	float[] flotArray= {1,2,3,4,5};
	System.out.println(flotArray[0]);
	System.out.println(flotArray[1]);
	System.out.println(flotArray[2]);
	System.out.println(flotArray[3]);
	System.out.println(flotArray[4]);
	System.out.println(Arrays.toString(flotArray));	
	
	double[] doubleArray= {1,2,3,4,5};
	System.out.println(doubleArray[0]);
	System.out.println(doubleArray[1]);
	System.out.println(doubleArray[2]);
	System.out.println(doubleArray[3]);
	System.out.println(doubleArray[4]);

	System.out.println(Arrays.toString(doubleArray));
	
	char[] charArray= {'A','B','C','D','E'};
	System.out.println(charArray[0]);
	System.out.println(charArray[1]);
	System.out.println(charArray[2]);
	System.out.println(charArray[3]);
	System.out.println(charArray[4]);
	System.out.println(Arrays.toString(charArray));	
	
	boolean[] booleanArray= {true,false,true};
	System.out.println(booleanArray[0]);
	System.out.println(booleanArray[1]);
	System.out.println(booleanArray[2]);
	
	System.out.println(Arrays.toString(booleanArray));	
	
	String[] StringArray= {"acbd","acbd","acbd","acbd","acbd"};
	System.out.println(StringArray[0]);
	System.out.println(StringArray[1]);
	System.out.println(StringArray[2]);
	System.out.println(StringArray[3]);
	System.out.println(StringArray[4]);
	System.out.println(Arrays.toString(StringArray));	
	
}
}

