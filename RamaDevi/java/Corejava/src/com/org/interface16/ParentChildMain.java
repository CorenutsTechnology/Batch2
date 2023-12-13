package com.org.interface16;

public class ParentChildMain implements ParentInterface ,Childimplementation {
	@Override
	public void childName()
	{
		System.out.println("childName");
	}
	@Override
	public void parentName()
	{
		System.out.println("parentName");
	}
	@Override
	public void childProperties()
	{
		System.out.println("child properties");
	}
  @Override
	public void parentProperties()
	{
		System.out.println("parent properties");
	}

	public static void main(String[] args) {
		
		ParentChildMain parent=new ParentChildMain();
		/*parent.parentName();
		parent.parentProperties();
		System.out.println(parent.intValue1);*/
		parent.childName();
		parent.parentName();
		parent.childProperties();
		parent.parentProperties();
		
	}

}
