package assignment2;


public class Program1 {

	public static void main(String[] args) {
		Program1 classObject=new Program1();
		
		byte[] byteArray=new byte[3];
		classObject.byteValues(byteArray);
		
		short[] shortArray=new short[2];
		classObject.shortValues(shortArray);
		
		int intArray[]= new int [5];
		classObject.intValues(intArray);
		
		long[] longArray= new long [5];
		classObject.longValues(longArray);
		
		float[] floatArray=new float[2];
		classObject.floatValues(floatArray);
		
		double[] doubleArray=new double[2];
		classObject.doubleValues(doubleArray);
		
		String[] stringArray=new String[3];
		classObject.stringValues(stringArray);
		
		boolean[] booleanArray=new boolean[2];
		classObject.booleanValues(booleanArray);
		
		
	

	}
	private void byteValues(byte[] byteArray)
	{
		byteArray[0]=4;
		byteArray[2]=1;	
		System.out.println(byteArray[0]);
		System.out.println(byteArray[2]);
	}
	private void shortValues(short[] shortArray)
	{
		shortArray[0]=5;
		shortArray[1]=8;	
		System.out.println(shortArray[0]);
		System.out.println(shortArray[1]);
	}
	private void intValues(int[] intArray)
	{
		intArray[0]=10;
		intArray[2]=11;
		intArray[1]=12;
		intArray[3]=13;
		intArray[4]=14;
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
	}
	
	private void longValues(long[] longArray)
	{
		longArray[0]=1090980808;
		longArray[2]=1909808081;
		longArray[1]=1290980808;
		longArray[3]=1909808083;
		longArray[4]=190980894;
		System.out.println(longArray[0]);
		System.out.println(longArray[1]);
		System.out.println(longArray[2]);
		System.out.println(longArray[3]);
		System.out.println(longArray[4]);
		
	}
	
	
	private void floatValues(float[] floatArray)
	{
		floatArray[1]=6.9f;
		System.out.println(floatArray[0]);
		System.out.println(floatArray[1]);
		
	}
	private void doubleValues(double[] doubleArray)
	{
		doubleArray[0]=78.999;
		System.out.println(doubleArray[0]);
		
	}
	private void stringValues(String[] stringArray)
	{
		stringArray[0]="rakhi";
		System.out.println(stringArray[0]);
		
	}
	private boolean[] booleanValues(boolean[] booleanArray)
	{
		booleanArray[0]=true;
//		System.out.println(booleanArray[0]);
		return booleanArray;
		
	}
	

}
