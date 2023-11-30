package day_24_11_23_Assignments;

public class Q8_DeleteString {

	public static void main(String[] args) {
		StringBuffer name=new StringBuffer("CoreNuts Technologies Pvt ltd.");
		name=name.delete(name.indexOf("Technologies"), name.indexOf("Pvt"));
		System.out.println(name);
	}

}
