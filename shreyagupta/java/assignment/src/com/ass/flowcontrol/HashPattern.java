package com.ass.flowcontrol;

public class HashPattern {

	public static void main(String[] args) {
		HashPattern hashPattern = new HashPattern();

		hashPattern.hashPatternCode(5);
		System.out.println();
		hashPattern.hashPatternCode(7);
	}

	public void hashPatternCode(int number) {
		for (int row = 0; row < number; row++) {
			for (int column = 0; column < number; column++) {

				System.out.print("#" + " ");

			}
			System.out.println();
		}
	}

}
