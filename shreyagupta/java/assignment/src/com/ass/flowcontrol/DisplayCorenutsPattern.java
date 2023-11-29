package com.ass.flowcontrol;

public class DisplayCorenutsPattern {

	public static void main(String[] args) {
		DisplayCorenutsPattern corenutsWordPattern= new DisplayCorenutsPattern();
		corenutsWordPattern.corenutsPattern();
	}
	
	public void corenutsPattern() {
		char[] word= {'c','o','r','e','n','u','t','s'};
		for(int rowIndex=0;rowIndex<word.length;rowIndex++) {
			for(int columnIndex=1;columnIndex<word.length;columnIndex++) {
				if(rowIndex>=columnIndex)
				System.out.println(word[(rowIndex*10)+(columnIndex)]);
			}
		}
			
	
	}

}
