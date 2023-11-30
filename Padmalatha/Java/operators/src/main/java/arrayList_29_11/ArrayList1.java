package arrayList_29_11;

import java.util.*;

public class ArrayList1 {
	
	

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
	
		String s1="Jyothi";
		String s2=s1.intern();
		System.out.println(s1==s2);
	}
}
