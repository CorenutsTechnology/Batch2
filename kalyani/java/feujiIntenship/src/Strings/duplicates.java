package Strings;

public class duplicates {

	public static void main(String[] args) {
		String stringname="Corenuts technologies";
		String res=" ";
		int count=0;
		for(int i=0;i<stringname.length();i++) {
			
			for(int j=0;j<stringname.length();j++) {
				if(stringname.charAt(i)==stringname.charAt(j)) {
					count++;
				}
			}
			if(count>1&&res.indexOf(stringname.charAt(i))==-1) {
				res=res+stringname.charAt(i);
		
	}
			
			
		}
		System.out.println(res+count);
		

	}

}
