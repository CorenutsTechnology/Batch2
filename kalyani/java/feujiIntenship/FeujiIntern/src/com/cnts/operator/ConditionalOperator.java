package com.cnts.operator;

public class ConditionalOperator {
public String conditional(int value1,int value2) {
	String result=(value1>value2)?"greter":"less";
	System.out.println(result );
	return result ;
}
public boolean instanceofString(Object person) {
	return (person instanceof String);
}
public boolean instanceofString1(Object person1) {
	return (person1 instanceof Integer);
}
}
