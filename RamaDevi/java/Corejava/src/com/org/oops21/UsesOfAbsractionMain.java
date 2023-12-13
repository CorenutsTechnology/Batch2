package com.org.oops21;

public  class UsesOfAbsractionMain extends AbstactClass {

	@Override
	void absolute() {
	double abs=(intValue1+intValue2+intValue3)/3;
		System.out.println("the absolute is:"+abs);
	}
	public static void main(String[] args) {
		UsesOfAbsractionMain use=new UsesOfAbsractionMain();
		use.absolute();
		use.intValue1=50;
		use.absolute();
	}


}
