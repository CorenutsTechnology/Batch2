package flowcontrols_14;
import java.util.Scanner;

public class CupGame {
	public static int findingWinnerTeam(int[] team) {
		int result=0;
		for(int index=0;index<team.length;index++) {
			if(team[index]==0) {
				break;
			}
			result++;
		}
		return result;
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scn1.nextInt();
		int[] team = new int[size];
		
		for(int index1=0;index1<team.length;index1++) {
			System.out.println("Play the game");
			team[index1]=scn1.nextInt();
			
		}
		
		System.out.println(findingWinnerTeam(team));
		
		
		
		
		
		
	}
	

}
