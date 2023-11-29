package Strings;

public class ReverseString {

	public static void main(String[] args) {
		String Stringname = "CoreNuts Technologies PvtLtd";
		String rev = "";
		for(int i=0;i<Stringname.length();i++) {
			rev=Stringname.charAt(i)+rev;
		}
			System.out.println(rev);
			
		}

	}


