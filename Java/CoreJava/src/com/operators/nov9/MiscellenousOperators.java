package com.operators.nov9;

import com.crnt.nov7.Person;

public class MiscellenousOperators 
{
	
	
	String terinary(int value1 , int value2)
	{
		return (value1>value2)?"greater" : "lesser";
	}
	
	boolean instanceofMethod(Object string)
	{
		return string instanceof String;
	}
	boolean instanceofPerson(Object person)
	{
		return person instanceof Person;
	}
}
