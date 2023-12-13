package com.org.wrapper27;

public class StringToPrimitive {
public void StrToPrimit()
{
	String str1="25";
	String str2="27";
	String str3="87f";
	int intNum=Integer.parseInt(str1);
	System.out.println("int val is:"+intNum);
	byte bytenum=Byte.parseByte(str2);
	System.out.println("byte is:"+bytenum);
	long lonval=Long.parseLong(str2);
	System.out.println("long is:"+lonval);
	float floatVal=Float.parseFloat(str2);
	System.out.println("float is:"+floatVal);
}
	public static void main(String[] args) {
		StringToPrimitive stp=new StringToPrimitive();
		stp.StrToPrimit();
	}

}
