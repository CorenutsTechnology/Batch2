package com.crnts.constructors.assigmentD23;

public class App extends Phone {
  
	 int id=89899;
	String appName;
	public App() {
//		super();
		System.out.println("default contructor");
		
		
	}
	public App(int id, String appName) {
		this();
//		this.id=super.id;
		this.id=id;
		this.appName = appName;
		
	}
	
	public App(String appName) {
		super();

		
	}
	
	
	public static void main(String[] args) {
		App app=new App();
		app.display();
	}
	void display()
{      //Phone Phone=new Phone(898989,"redmi");
		App app =new App(898989,"insta");
		System.out.println(app.appName);
		System.out.println(app.id);

		System.out.println(super.id);
		System.out.println(this.id);
		
		App app1 =new App("gmail");
		System.out.println(app1);
		}
	
	
}
