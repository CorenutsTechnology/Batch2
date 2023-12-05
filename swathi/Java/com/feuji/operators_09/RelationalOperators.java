package com.feuji.operators_09;

public class RelationalOperators {
	
	public boolean greater(int value1,int value2) {
		boolean result = (value1 > value2);
		return result;
	}
	public boolean greaterThanOrEqualTo(int value1,int value2) {
		boolean result = (value1 >= value2);
		return result;
	}
	public boolean lesser(int value1,int value2) {
		boolean result = (value1 < value2);
		return result;
	}
	public boolean lesserThanOrEqualTo(int value1,int value2) {
		boolean result = (value1 <= value2);
		return result;
	}
	public boolean equal(int value1,int value2) {
		boolean result = (value1 == value2);
		return result;
	}
	public boolean NotEqualTo(int value1,int value2) {
		boolean result = (value1 != value2);
		return result;
	}
	public static void main(String[] args) {
		RelationalOperators relationalOperators = new RelationalOperators();
		boolean resultOfGreater = relationalOperators.greater(10, 5);
		System.out.println(resultOfGreater);
		boolean resultOfgreaterThanOrEqualTo = relationalOperators.greaterThanOrEqualTo(15, 10);
		System.out.println(resultOfgreaterThanOrEqualTo);
		boolean resultOflesser = relationalOperators.lesser(10, 15);
		System.out.println(resultOflesser);
		System.out.println(relationalOperators.lesserThanOrEqualTo(55, 35));
		System.out.println(relationalOperators.equal(10, 20));
		System.out.println(relationalOperators.NotEqualTo(20, 20));
	
	}

}
