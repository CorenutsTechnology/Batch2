package day_24_11_23_Assignments;

public class Q4_CompareStringValues {
	
	public static void main(String[] args) {
		String string1="corenuts";
		String string2="corenuts";
		System.out.println(string1.equals(string2));
		
		String string3="CORENUTS";
		System.out.println(string1.equals(string3));
		
		String string4=new String("corenuts");
		System.out.println(string1.equals(string4));
		
		String string5=new String("technologies");
		System.out.println(string5.equals(string4));
		
		String string6=new String("corenuts");
		System.out.println(string6.equals(string4));
	}
}
