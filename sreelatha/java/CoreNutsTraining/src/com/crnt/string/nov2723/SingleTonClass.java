package com.crnt.string.nov2723;

public class SingleTonClass {
	static SingleTonClass  s = null;

	
	  private SingleTonClass() { System.out.println("this is a single ton classs");
	  }
	 
	public static SingleTonClass getInstance() {
		if(s==null)
		{
			s= new SingleTonClass();
		}
		
		return s;
	}
	public void hello()
	{
		System.out.println("hiiiii");
	}
	
	public void day()
	{
		System.out.println("have a nice dayyy");
	}

}
