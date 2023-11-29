package com.ass.flowcontrol;

public class StarPattern {

	public static void main(String[] args) {
		StarPattern starPattern = new StarPattern();

		starPattern.starPatternCode(10);
		
	}

	public void starPatternCode(int value) {
		for (int row = 0; row < value; row++) {
			for (int column = 0; column < value; column++) {
				if (column >= row) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
