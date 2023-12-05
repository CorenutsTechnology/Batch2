package com.crnts.oops;

public class ChildP7 extends ParentP7 {

	public static void main(String[] args) {
		ChildP7 object1 =new ChildP7();
		object1.display(); //visible
		
		ParentP7 object2=new ChildP7(); //Up casting
		object1.display();  //visible
		
//		ChildP7 object3 = new ParentP7(); //CTE type caste operator needed
//		ChildP7 object3 = (ChildP7) new ParentP7(); //ClassCastException Direct down casting
//		object3.display();
		
		ParentP7 object4=new ChildP7();
		ChildP7 object5 =(ChildP7)object4;
		object5.display();
	}

}
