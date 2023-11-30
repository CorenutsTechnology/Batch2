package day_24_11_23_Assignments;

public class Q1_CharArray {

	public static void main(String[] args) {
		Q1_CharArray charArray=new Q1_CharArray();
		charArray.array("vaishali");
	}

	public void array(String name) {
		char charArray[]=name.toCharArray();
		for(int index=0;index<charArray.length;index++) {
			System.out.print(charArray[index]+" ");
		}
	}
}
