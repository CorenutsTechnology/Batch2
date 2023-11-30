package day_24_11_23_Assignments;

public class Q7_TokenizedStrings {

	public static void main(String[] args) {
		String name="CoreNuts Technologies Pvt ltd.";
		String[] stringArray=name.split(" ");
		for(String index:stringArray) {
			System.out.println(index);
		}
	}

}
