package com.cupgame.nov14;

import java.util.Scanner;
public class CupGame 
{
	static int[] teams = new int[5];
	static Scanner sc = new Scanner(System.in);
	
	public void create(int teamCount ,int teamNumber)
	{
		int[] team = new int[teamCount];
		System.out.println("Enter points of team- "+(teamNumber));
		int sum=0;
		for(int index=0;index<teamCount;index++)
		{
			team[index]=sc.nextInt();
			sum += team[index];
		}
		teams[teamNumber]=sum;
	}
	/*
	 * this method will return winner among all teams
	 */
	public void winner()
	{
		for (int i = 0; i < teams.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < teams.length; j++)
            {  
                if (teams[j] > teams[index])
                {  
                    index = j;//searching for highest index  
                }      
            }
            System.out.println("Winner is team"+index+" with score "+teams[index]);
            break;
        }
	}
	public static void main(String[] args) 
	{
		CupGame cupGame = new CupGame(); 
		System.out.println("Enter no.of Team members: ");
		int teamCount = sc.nextInt();
			
		for(int index=0;index<teams.length;index++)
		{
			
			cupGame.create(teamCount , index);
			
		}
		
		cupGame.winner();
		sc.close();
		
	}
}
