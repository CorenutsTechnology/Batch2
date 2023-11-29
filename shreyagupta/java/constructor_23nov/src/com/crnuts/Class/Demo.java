package com.crnuts.Class;

  public  class Demo {
	
	//ques-5
	
	public static int num;
	public static String name;
	public static boolean flag;
	
	public Demo(int num,String name,boolean flag) {
		this.num=num;
		this.name=name;
		this.flag=flag;
	}
	
	public static void main(String[] args) {
		Demo demo=new Demo(5, "shreya",true);
		System.out.println(demo.num);
		System.out.println(demo.name);
		System.out.println(demo.flag);
		
		
	}

}
