package Assignments;
import java.util.Scanner;
public class GradeBasedMarksUsingElseIfLadder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total marks");
		int totalmarks=sc.nextInt();
		
		if(totalmarks>=90) {
			System.out.println("Grade A");
		}
		else if(totalmarks>=80){
			System.out.println("Grade B");
		}
		else if(totalmarks>=60) {
			System.out.println("Grade C");
		}
		else if(totalmarks>=35) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}

}
}
