package Strings;

import java.util.StringTokenizer;

public class SpliteString {

	public static void main(String[] args) {
		String Stringname = "CoreNuts Technologies PvtLtd"
				+ "";
		StringTokenizer name=new StringTokenizer(Stringname, " ");
		StringTokenizer name1=new StringTokenizer(Stringname, "  ",false);
		while(name.hasMoreTokens()) {
			System.out.println(name.nextElement());
		}
		
		
		
		while(name1.hasMoreTokens()) {
			System.out.println(name1.nextElement());
		}
		
	}

}
