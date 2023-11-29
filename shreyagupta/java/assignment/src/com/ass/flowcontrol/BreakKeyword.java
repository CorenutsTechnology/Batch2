package com.ass.flowcontrol;

public class BreakKeyword {
public static void main(String[] args) {
	BreakKeyword breakKeyword= new BreakKeyword();
	breakKeyword.workOfBreakKeyword();
}

public void workOfBreakKeyword() {
	for(int value=1;value<=100;value++) {
		if(value==47) {
			break;
		}
		System.out.println(value);
	}
}
}
