package com.crnuts.genericClass;

import java.util.ArrayList;

//---------------Ques 2----------------

public class GenericClass<T> {

	String str ;
	private T t1;

	public GenericClass(String str, T t1) {
		super();
		this.str = str;
		this.t1 = t1;
	}

	
	public T getT1() {
		return t1;
	}

	public void setT1(T t1) {
		this.t1 = t1;
	}
	
	

}
