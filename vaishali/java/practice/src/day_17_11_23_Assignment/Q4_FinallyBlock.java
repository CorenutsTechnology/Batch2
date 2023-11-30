package day_17_11_23_Assignment;

public class Q4_FinallyBlock {

	public static void main(String[] args) {
		int intArray[]= {3,2,1};
		try {
			System.out.println(intArray[3]);
		}
		finally {
			System.out.println("In finally blockwe can not handle the exception without catch block");
//			try {
//				System.out.println(5/0);
//			} finally {
//				System.out.println("finally");
//			}
		}
	}

}
