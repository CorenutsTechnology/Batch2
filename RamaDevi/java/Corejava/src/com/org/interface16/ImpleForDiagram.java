package com.org.interface16;

public class ImpleForDiagram implements Diagram {
	@Override
	public void circle()
	{
		System.out.println("public method circle");
	}
//	@Override
//	public void square()
//	{
//		System.out.println("public method square");
//	}
//	@Override
//	public void rectangle()
//	{
//		System.out.println("protected method rectangle");
//	}
	@Override
	public  void cone()
	{
		System.out.println("default method");
	}
	public static void main(String[] args) {
		ImpleForDiagram implefordiagram=new ImpleForDiagram ();
		implefordiagram.circle();
		implefordiagram.cone();
		

	}

}
