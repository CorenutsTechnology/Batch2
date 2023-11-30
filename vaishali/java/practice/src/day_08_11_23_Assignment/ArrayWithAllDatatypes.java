package day_08_11_23_Assignment;

public class ArrayWithAllDatatypes {

	public static void main(String[] args) {
		 ArrayWithAllDatatypes allDatatypes=new ArrayWithAllDatatypes();
		 allDatatypes.byteMethod();
		 allDatatypes.shortMethod();
		 allDatatypes.intMethod();
		 allDatatypes.longMethod();
		 allDatatypes.floatMethod();
		 allDatatypes.doubleMethod();
		 allDatatypes.booleanMethod();
		 allDatatypes.charMethod();
	}
	
	public void byteMethod() {
		byte[] byteArray=new byte[5];
		byteArray[0]=1;
		byteArray[1]=2;
		byteArray[2]=3;
		byteArray[3]=4;
		byteArray[4]=5;
		System.out.println("byte array values : ");
		System.out.println(byteArray[0]);
		System.out.println(byteArray[1]);
		System.out.println(byteArray[2]);
		System.out.println(byteArray[3]);
		System.out.println(byteArray[4]);
	}
	
	public void shortMethod() {
		short[] shortArray=new short[5];
		shortArray[0]=12;
		shortArray[1]=13;
		shortArray[2]=14;
		shortArray[3]=15;
		shortArray[4]=16;
		System.out.println("short array values : ");
		System.out.println(shortArray[0]);
		System.out.println(shortArray[1]);
		System.out.println(shortArray[2]);
		System.out.println(shortArray[3]);
		System.out.println(shortArray[4]);
		
	}
	public void intMethod() {
		int[] intArray=new int[5];
		intArray[0]=12;
		intArray[1]=13;
		intArray[2]=14;
		intArray[3]=15;
		intArray[4]=16;
		System.out.println("int array values : ");
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
	}
	public void longMethod() {
		long[] longArray=new long[5];
		longArray[0]=20;
		longArray[1]=30;
		longArray[2]=40;
		longArray[3]=50;
		longArray[4]=60;
		System.out.println("long array values : ");
		System.out.println(longArray[0]);
		System.out.println(longArray[1]);
		System.out.println(longArray[2]);
		System.out.println(longArray[3]);
		System.out.println(longArray[4]);
	}
	public void floatMethod() {
		float[] floatArray=new float[3];
		floatArray[0]=34;
		floatArray[1]=4;
		floatArray[2]=45;
		System.out.println("float array values : ");
		System.out.println(floatArray[0]);
		System.out.println(floatArray[1]);
		System.out.println(floatArray[2]);
	}
	public void doubleMethod() {
		double[] doubleArray=new double[3];
		doubleArray[0]=56;
		doubleArray[1]=5;
		doubleArray[2]=6;
		System.out.println("double array values : ");
		System.out.println(doubleArray[0]);
		System.out.println(doubleArray[1]);
		System.out.println(doubleArray[2]);
	}
	public void booleanMethod() {
		boolean[] booleanArray=new boolean[2];
		booleanArray[0]=true;
		booleanArray[1]=false;
		System.out.println("boolean array values : ");
		System.out.println(booleanArray[0]);
		System.out.println(booleanArray[1]);
	}
	public void charMethod() {
		char[] charArray=new char[2];
		charArray[0]='a';
		charArray[1]='b';
		System.out.println("char array values : ");
		System.out.println(charArray[0]);
		System.out.println(charArray[1]);
	}
}
