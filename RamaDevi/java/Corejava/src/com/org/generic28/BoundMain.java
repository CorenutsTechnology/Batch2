package com.org.generic28;

public class BoundMain {

	public static void main(String[] args) {
		BoundedParameter<BoundGrandChild> boundedParameter=new BoundedParameter<BoundGrandChild>(new BoundGrandChild());
		boundedParameter.doTest();
		BoundedParameter<BoundSub> boundedsub=new BoundedParameter<BoundSub>(new BoundSub());
		boundedsub.doTest();
		BoundedParameter<BoundSuper> boundedsuper=new BoundedParameter<BoundSuper>(new BoundSuper());
		boundedsuper.doTest();
		
		//BoundedParameter<BoundSub> sup=new BoundedParameter<BoundSub>(new BoundSuper());
		
	}

}
