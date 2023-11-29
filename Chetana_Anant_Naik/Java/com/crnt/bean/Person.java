package com.crnt.bean;

public class Person {//THIS IS POJO OR BEAN CLASS
private int value;
private String name;
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Person [value=" + value + ", name=" + name + "]";
}

}
