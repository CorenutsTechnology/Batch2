package com.ass.game;


import java.util.Scanner;

public class TeamGame {

	static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter flag");
		boolean flag = scanner.nextBoolean();
		TeamGame teams = new TeamGame();
		int[] totalTeamPoint = new int[5];
		teams.teamPoint(totalTeamPoint,flag);

	}

	public void teamPoint(int[] totalTeamPoint,boolean flag) {
		
		
		for (int team = 1; team <= 5; team++) {
			int countPoint = 0;
			if (flag == true) {
				countPoint = 1;
			}
			for (int member = 1; member <= 5; member++) {
				totalTeamPoint[member] = countPoint;
			}

		}

		for (int member = 1; member <= 5; member++) {
			System.out.print(totalTeamPoint[member]);
		}

	}
	

}
