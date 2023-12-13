package com.feuji9nov;

public class TernaryOperator 
{
	public String eligibility(int age)
	{
		String result=((age>=18)&&(age<=40))?"Eligible for marriage":"not eligible";
		return result;
	}

}
