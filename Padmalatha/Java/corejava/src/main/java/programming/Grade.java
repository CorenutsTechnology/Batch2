package programming;
import java.util.*;
public class Grade {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the the total marks of the student");
		int n=scanner.nextInt();
		if(n>=950)
		{
			System.out.println("A Grade");
		}
		else if(n>=900)
		{
			System.out.println("B Grade");
		}
		else if(n>=700)
		{
			System.out.println("C Grade");
		}
		else if(n>=600){
			System.out.println("D Grade");
		}
		else if(n>=400) {
			System.out.println("E Grade");
		}
		else {
			System.out.println("F Grade");
		}
			
			
		
	}
}
