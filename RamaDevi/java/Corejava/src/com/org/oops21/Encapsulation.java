package com.org.oops21;

public class Encapsulation {
private int intValue;
private String name;
private double doubleValue;
public int getIntValue() {
	return intValue;
}
public void setIntValue(int intValue) {
	this.intValue = intValue;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getValue() {
	return doubleValue;
}
public void setValue(double value) {
	this.doubleValue = value;
}
public static void main(String[] args) {
	Encapsulation encapsul=new Encapsulation();
	encapsul.setName("ram");
	encapsul.getName();
	encapsul.setIntValue(7);
	encapsul.getIntValue();
	encapsul.setValue(56.08);
	encapsul.getValue();
}
}
