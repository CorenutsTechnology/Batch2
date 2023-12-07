//Write a program to display 1 to 100 values while executing thread job in slow face.
package com.crnts.thread_2;

public class SlowFaceThread_Test {
  public static void main(String[] args) {
	  SlowFaceThread_Test test=new SlowFaceThread_Test();
	  test.slow();
	
}
  public void slow()
  {
	  Thread first =new Thread(new SlowFaceThread());
	
		first.start();
  }
}
