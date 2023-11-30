package day_08_11_23;

public class StringArray {

	public static void main(String[] args) {
		String[] stringArray=new String[5];
		stringArray[0]="hyderabad";
		stringArray[1]="bangalore";
		stringArray[2]="chennai";
		stringArray[3]="mumbai";
		stringArray[4]="vizag";
		System.out.println(stringArray[1]);
		System.out.println(stringArray[3]);
//		System.out.println(stringArray[6]);//ArrayIndexOutOfBoundsException
	}

}
