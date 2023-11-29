package com.crnt.test.nov;

import Interface_Collection.MethodOverLoading;

public class MethodOverLoading_21 implements MethodOverLoading{
public static void main(String[] args) {
	MethodOverLoading_21 methodOverLoading=new MethodOverLoading_21();
	methodOverLoading.methodOverLoading("String", methodOverLoading);
	methodOverLoading.methodOverLoading();
}
public void methodOverLoading() {
	System.out.println("without argument");
}
@Override
public void methodOverLoading(int value) {
	System.out.println("intiger as argument");
	
}
@Override
public void methodOverLoading(String stringValue) {
	System.out.println("String as argument");
	
}
@Override
public void methodOverLoading(String stringValue, int value) {
	System.out.println("intiger & String");
	
}
@Override
public void methodOverLoading(String stringValue, Object obj) {
	System.out.println("object & String"+obj+""+stringValue);
	
}
}
