//4. show the behavior of thread by influencing thread functions (sleep, join, yield)

package com.december06;

public class MainClass4a {
	public static void main(String[] args) {
		Program4a obj = new Program4a();
		new Thread(obj).start();
	}
	
}
