package com.cnts.nov16;

public interface AccessModifier5 {

	public void method1();
	static void method2() {}
    void method3();
    abstract void method4();
//    protected void method5();
//    private void method6();
//    final void method7();
}

class SubClass2 implements AccessModifier5
{

	@Override
	public void method1() {
		System.out.println("we can create a abstract method ");
	}

	@Override
	public void method3() {
		
	}

	@Override
	public void method4() {
		
	}

//	@Override
//	public void method5() {
//		
//	}
//
//	@Override
//	public void method6() {
//		
//	}
//
//	@Override
//	public void method7() {
//		
//	}
	}
