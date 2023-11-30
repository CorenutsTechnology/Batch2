package day_24_11_23_Assignments;

public class Q9_InsertString {

	public static void main(String[] args) {
		StringBuffer name=new StringBuffer("CoreNuts Pvt ltd.");
		name.insert(name.indexOf("Pvt"), "Technologies ");
		System.out.println(name);
	}

}
