package Strings;

public class RevStringWords {

	public static void main(String[] args) {
		String Stringname = "CoreNuts Technologies PvtLtd";
		String[ ] ch=Stringname.split(" ");
		String res = "";
		for(int i=ch.length-1;i>=0;i--) {
			res=res+ " "+ch[i];
		}
		System.out.println(res);

}
	}