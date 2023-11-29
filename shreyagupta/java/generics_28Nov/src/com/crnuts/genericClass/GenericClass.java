package com.crnuts.genericClass;

import java.util.ArrayList;

//---------------Ques 2----------------

public class GenericClass<T> {

	private T obj;

	public GenericClass(T obj) {
		this.obj = obj;
	}

	public T getGeneric() {
		return this.obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}
