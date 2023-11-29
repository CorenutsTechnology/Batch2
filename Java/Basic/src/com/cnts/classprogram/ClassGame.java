package com.cnts.classprogram;

public class ClassGame
{
	int[] team1 = {1,1,0,1,1};
	int[] team2 = {0,1,0,1,0};
	int[] team3 = {1,0,0,1,1};
	int[] team4 = {1,1,1,1,1};
	int[] team5 = {1,1,1,1,0};
	int[] classs = new int[5];
	
	public void sumAllPoint(int[] arr,int size)
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		classs[size]=sum;
	}
	
public static void main(String[] args) {
		
	ClassGame game = new ClassGame();

	}
}
