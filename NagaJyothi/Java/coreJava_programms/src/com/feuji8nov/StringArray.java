package com.feuji8nov;

public class StringArray 
{
	
	public static void main(String[] args) 
	{
		StringArray sarray=new StringArray();
		//String[] sArray=new String[4];
		String[] value=sarray.stringArrayDetails(new String[] {"hyd","ban","ren"});
		//System.out.println(sArray[1]);
		System.out.println(value[1]);

		
	}

	public String[] stringArrayDetails( String[] sArray) 
	{
		/*
		 * sArray[0]="Hyd"; sArray[1]="Bengalore"; sArray[2]="Delhi";
		 * sArray[3]="Rentachintala";
		 */
		return sArray;
		
	}

}
