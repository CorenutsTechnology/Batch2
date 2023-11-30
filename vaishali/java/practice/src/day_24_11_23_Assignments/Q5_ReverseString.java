package day_24_11_23_Assignments;

public class Q5_ReverseString {

	public static void main(String[] args) {
		Q5_ReverseString reverseString=new Q5_ReverseString();
		System.out.println(reverseString.reverse1("CoreNuts Technologies Pvt ltd."));
	}

	public String reverse1(String name) {
		String reverse="";
		for (int index = 0; index < name.length(); index++) {
			reverse=name.substring(index,index+1)+reverse;
		}
		return reverse;
	}
	
	
}
