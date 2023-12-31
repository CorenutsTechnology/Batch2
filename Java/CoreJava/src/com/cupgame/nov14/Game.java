package com.cupgame.nov14;

public class Game 
{
	int[] team1 = {1,1,0,1,1};
	int[] team2 = {1,1,1,1,0};
	int[] team3 = {1,1,0,0,1};
	int[] team4 = {0,1,0,1,1};
	int[] team5 = {1,0,0,0,1};
	int[] groups=new int[5];
	
	public void total(int[] team,int value)
	{
		int sum=0;
		for(int index=0;index<team.length;index++)
		{
			sum += team[index];
		}
		groups[value]=sum;
	}
	
	public int winner()
	{
		int max=groups[0];
		for(int index=1;index<groups.length;index++)
		{
			if(max<groups[index])
				max=groups[index];
		}
		return max;
	}
	public static void main(String[] args) 
	{
		Game game = new Game();
		game.total(game.team1,0);
		game.total(game.team2,1);
		game.total(game.team3,2);
		game.total(game.team4,3);
		game.total(game.team5,4);
		
		for(int i=0;i<game.groups.length;i++)
		{
			System.out.println(game.groups[i]);
		}
		System.out.println("winner is: "+game.winner());
	}

}
