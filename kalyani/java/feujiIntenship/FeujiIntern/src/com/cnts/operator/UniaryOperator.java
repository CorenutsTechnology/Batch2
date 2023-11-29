package com.cnts.operator;

public class UniaryOperator {
public int PostIncrement(int value) {
	//value++;
	System.out.println("post increment result"+ value++);
	return value;
}
public int PreIncrement(int value) {
	//++value;
	System.out.println("pre increment result"+ ++value);
	return value;
}
public int Postdecrement(int value) {
	value--;
	System.out.println("post decrement result"+ value--);
	return value;
}
public int Predecrement(int value) {
	--value;
	System.out.println("pre decrement result"+ --value);
	return value;
}
}
