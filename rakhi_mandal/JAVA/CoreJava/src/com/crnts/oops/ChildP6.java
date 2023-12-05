
package com.crnts.oops;

public class ChildP6 extends ParentP6 {
	 int num=8;
public static void main(String[] args) {
	ChildP6 childP6=new ChildP6();
	childP6.setId(2);
	System.out.println(childP6.getId());
	System.out.println(childP6.num);
	
	ParentP6 parentP6=new ParentP6();
	parentP6.setId(6);
	System.out.println(parentP6.getId());
//	System.out.println(parentP6.num); //CTE
}
}
