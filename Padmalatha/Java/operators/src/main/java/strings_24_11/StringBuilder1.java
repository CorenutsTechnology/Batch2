package strings_24_11;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb=new StringBuilder("Hi!How are you");
		//It will print the ascii value of char present at that index
		System.out.println(sb.codePointAt(7));
		System.out.println(sb.capacity());
		//It will print the ascii value of char present before index
		System.out.println(sb.codePointBefore(8));
		
	}

}
