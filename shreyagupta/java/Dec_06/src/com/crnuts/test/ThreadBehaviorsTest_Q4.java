package com.crnuts.test;

import com.crnuts.classes.ThreadBehaviors_Q4;

public class ThreadBehaviorsTest_Q4 {

	public static void main(String[] args) {
		ThreadBehaviors_Q4 behaviors =new ThreadBehaviors_Q4();
		
		Thread thread=new Thread(behaviors);
		
		//behaviors.sleepBehaviour();
		
		
		
	behaviors.joinBehaviour();
		
		
		
	//behaviors.yieldBehaviour();
		
		

	}

}
