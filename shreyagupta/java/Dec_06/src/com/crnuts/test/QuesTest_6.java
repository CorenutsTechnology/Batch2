package com.crnuts.test;

import com.crnuts.classes.Ques_6;

public class QuesTest_6 {

	public static void main(String[] args) {
		
		Ques_6 slowFace =new Ques_6();	
		Thread thread1=new Thread(slowFace);
//        Thread thread2=new Thread(slowFace);
//        Thread thread3=new Thread(slowFace);
        
        thread1.start();
//        thread2.start();
//        thread3.start();

	}

}
