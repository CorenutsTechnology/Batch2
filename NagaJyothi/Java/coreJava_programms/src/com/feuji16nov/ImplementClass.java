package com.feuji16nov;

public class ImplementClass implements Caluclate
{

	@Override
	public void caluclateMethod( int value1,int value2) 
	{
		int result=value1+value2;
		System.out.println(result);
		
	}
	public static void main(String[] args) 
	{
		ImplementClass output=new ImplementClass();
		output.caluclateMethod(-5, -10);
	}
	

}
