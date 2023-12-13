package com.org.oop21;

public class ChildMain extends Parent{
	@Override
	public Object job()
	{
		System.out.println("child job");
		return new Parent();
	}
	public Object work()
	{
		System.out.println("child work");
		return new ChildMain();
	}

	public static void main(String[] args) {
		ChildMain child=new ChildMain();
		child.job();
		Parent parent=new Parent();
		parent.job();
		Man man =new Man();
		man.job();
//		ChildMain c1=(ChildMain) new Parent();
//		c1.job();

	}

}
