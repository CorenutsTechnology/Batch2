package com.feuji15novtest;

import com.feuji15nov.AccessModifiers;

public class AccModifires3  extends AccessModifiers
{
	AccessModifiers modifire=new  AccessModifiers();
	public void access()
	{
		System.out.println(modifire.a);
		//System.out.println(modifire.c);//c is not visible becoz  c is  default we cannot access another package.
		System.out.println(result);
	}

}
