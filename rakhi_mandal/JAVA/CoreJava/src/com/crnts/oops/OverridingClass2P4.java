package com.crnts.oops;

public class OverridingClass2P4 extends OverridingMainClass4 {
	public static void main(String[] args) {
		OverridingClass2P4 overridingClass2P4=new OverridingClass2P4();
		overridingClass2P4.displayDefault();
		overridingClass2P4.displayPublic();
		overridingClass2P4.displayProtected();
	}


	@Override
	/*public--works */  /*private--not works */ void displayDefault() {    
     System.out.println("Implementation given in Class 2");
	}

	@Override
	/*protected,default,private--not works */ public void displayPublic() {
		 System.out.println("Implementation given in Class 2");		
	}

	@Override
	/*protected,public--works */ /*private,default--not works */protected void displayProtected() {
		 System.out.println("Implementation given in Class 2");		
	}

}
