package com.crnuts.test;

import com.crnuts.classes.ImplThread_Q3_Q4;

public class ImplThreadTest_Q3 {

	public static void main(String[] args) {
		
		
            ImplThread_Q3_Q4 implThread= new ImplThread_Q3_Q4();
            Thread thread1=new Thread(implThread);
            Thread thread2=new Thread(implThread);
            Thread thread3=new Thread(implThread);
            Thread thread4=new Thread(implThread);
            Thread thread5=new Thread(implThread);
            
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
            
            
            
            
            
           
	}

}
