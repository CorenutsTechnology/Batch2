package com.ass.flowcontrol;

public class NumberPattern {

	public static void main(String[] args) {
		NumberPattern numberPattern = new NumberPattern();
		numberPattern.numberPatternCode(5);

	}

	public void numberPatternCode(int number) {
		for (int row = 1; row <= number; row++) {
			for (int column = 1; column <= number; column++) {
				if (row >= column) {
					System.out.print(column + " ");
				}
			}
			System.out.println();
		}
	}

}
