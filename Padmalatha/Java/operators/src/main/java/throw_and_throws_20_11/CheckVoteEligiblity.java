package throw_and_throws_20_11;

import java.util.Scanner;

public class CheckVoteEligiblity {

	//public static void main(String[] args)
	public void checkEligibility()
	{
		// TODO Auto-generated method stub
		CheckVoteEligiblity checkVoteEligiblity= new CheckVoteEligiblity();
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=scanner.nextInt();
		checkVoteEligiblity.check(age);
	}

	private void check(int age) {
		// TODO Auto-generated method stub
		if(age<18)
		{
			try{
				throw new InValidAge("Invalid Age");
			}catch(InValidAge e)
			{
				e.printStackTrace();
				System.out.println("Not Eligible For Voting");
			}
		}
		else {
			System.out.println("Eligible For Voting");
		}
	}
	


}
