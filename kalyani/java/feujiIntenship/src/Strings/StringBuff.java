package Strings;

public class StringBuff {

	public static void main(String[] args) {
		String Stringname = "CoreNuts Technologies PvtLtd";
		StringBuffer buffer=new StringBuffer(Stringname);
		
		System.out.println(buffer.delete(7,21));
		System.out.println(buffer.insert(7, "Technologies"));
		
	}

}
