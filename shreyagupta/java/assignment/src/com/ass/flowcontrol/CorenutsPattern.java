package com.ass.flowcontrol;

public class CorenutsPattern {

	public static void main(String[] args) {
		CorenutsPattern corenutsPattern=new CorenutsPattern();

		char[] stringName= {'c','o','r','e','n','u','t','s'};
		
		corenutsPattern.starPatternCode(stringName);
	}

	public void starPatternCode(char[] name) {
		for (int row = 0; row < name.length; row++) {
			for (int column = 0; column < name.length; column++) {
				if (column <= row) {
					System.out.print(name[column]);
				}
			}
			System.out.println();
		}
	}

}
