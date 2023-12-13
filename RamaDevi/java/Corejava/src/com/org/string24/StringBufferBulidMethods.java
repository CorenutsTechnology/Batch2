package com.org.string24;

public class StringBufferBulidMethods {

	public void bufferMethods(String s)
	{
		StringBuffer b=new StringBuffer();
		System.out.println(b.append("ram"));
		System.out.println(b.toString());
		System.out.println(b.lastIndexOf(s));
		b.chars();
		b.codePoints();
		b.delete(0, 2);
		b.reverse();
		b.equals(b);
	}
	public void builderMethods()
	{
		StringBuilder sb=new StringBuilder();
		sb.append(false);
		sb.codePointAt(4);
		sb.delete(0, 3);
		sb.equals(sb);
		sb.hashCode();
		sb.toString();
	}

	public static void main(String[] args) {
		StringBufferBulidMethods stringBufferBulidMethods=new StringBufferBulidMethods ();
		stringBufferBulidMethods.bufferMethods("java is an oop language");
	}

}
