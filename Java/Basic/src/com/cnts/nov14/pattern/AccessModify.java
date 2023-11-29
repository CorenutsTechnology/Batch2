package com.cnts.nov14.pattern;

import com.cnts.nov15.AccessModifiers;
import com.cnts.nov15.ProtectedDefault;

public class AccessModify extends ProtectedDefault
{
public static void main(String[] args) {
	AccessModifiers modifiers = new AccessModifiers();
	AccessModify modify = new AccessModify();
//	System.out.println(modifiers.name);  //name is public we can access it in different package
//	System.out.println(modifiers.phone);  //phone is protected so we can't access it in 
//	System.out.println(modifiers.gender); //gender is default so cant access it
//	modifiers.display(); //this method is private so we can't access it in different package

}
}
