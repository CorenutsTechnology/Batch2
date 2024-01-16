 package com.feuji29nov;

public class GenericTest 
{
	/*
	 * public <T> void compare(T value1,T value2) {
	 * System.out.println(value1.equals(value2)); }
	 */
	public <T extends /*Number*/ Comparable<T>> void compare(T value1,T value2)
	{
		System.out.println(value1.equals(value2));
	}
    public void compare(String s1,String s2)
    {
    	System.out.println(s1+""+s2+"");
    }
	public static void main(String[] args) 
	{
		GenericTest result=new GenericTest();
		//result.<GenericClass>compare(new GenericClass(), new GenericClass());
		result.<String>compare("Jyothi", "bathula");
		result.compare("hii","hello");
		result.<Integer>compare(10,20);
		
	} 

}
