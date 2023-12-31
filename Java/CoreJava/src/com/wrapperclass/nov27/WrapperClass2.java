package com.wrapperclass.nov27;

public class WrapperClass2
{
	public static void main(String[] args) 
	{
		Byte b = new Byte((byte) 10);
		System.out.println(b);
		short S =10;
		Short s = new Short(S);
		System.out.println(s);
		int i=15;
		Integer I = new Integer(i);
		System.out.println(I);
		Long l = new Long(123);
		System.out.println(l);
		Double d = new Double(456);
		System.out.println(d);
		Float f = new Float(98);
		System.out.println(f);
		Character ch = new Character('c');
		System.out.println(ch);
		Boolean bb = new Boolean(true);
		System.out.println(bb);
	}
}
