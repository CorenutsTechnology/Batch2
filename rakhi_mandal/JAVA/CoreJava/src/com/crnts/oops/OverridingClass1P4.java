package com.crnts.oops;

public class OverridingClass1P4 extends OverridingMainClass4 {
	
	public static void main(String[] args) {
		OverridingClass1P4 overridingClass1P4=new OverridingClass1P4();
		overridingClass1P4.displayDefault();
		overridingClass1P4.displayPublic();
		overridingClass1P4.displayProtected();
	}
	@Override
	/*public--works */  /*private--not works */ void displayDefault() {    
     System.out.println("Implementation given in Class 1");
	}

	@Override
	/*protected,default,private--not works */ public void displayPublic() {
		 System.out.println("Implementation given in Class 1");		
	}

	@Override
	/*protected,public--works */ /*private,default--not works */protected void displayProtected() {
		 System.out.println("Implementation given in Class 1");		
	}

}
