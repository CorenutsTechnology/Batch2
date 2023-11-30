package day_24_11_23_Assignments;

public class Q6_ReverseWords {

	public static void main(String[] args) {
		Q6_ReverseWords word=new Q6_ReverseWords();
		word.reverse("CoreNuts Technologies Pvt ltd.");
	}

	public void reverse(String name) {
		String[] stringArray=name.split(" ");
		String result="";
		for(int index=stringArray.length-1;index>=0;index--) {
			result=result+stringArray[index]+" ";
		}
		System.out.println(result);
	}
}
