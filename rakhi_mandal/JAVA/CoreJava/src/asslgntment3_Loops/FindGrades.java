package asslgntment3_Loops;

import java.util.Scanner;

public class FindGrades {

	public static void main(String[] args) 
  {     Scanner sc=new Scanner(System.in);
		FindGrades findGrades=new FindGrades();
		System.out.println("Which case you want to check : 1.Switch 2.Ifelse ");
		String respose=sc.nextLine();
		switch(respose)
		{
		case "Switch":
			{ 
				System.out.println("Enter your marks within 0-100:");
				findGrades.gradesSwitchCase(sc.nextInt());
			}
		case "Ifelse":
			{   System.out.println("Enter your marks within 0-100:");
				findGrades.gradesIfElse(sc.nextInt());
			}
		default: System.out.println("Enter valid option");
		}
	
		
		
		}		
		
	public int gradesSwitchCase( int totalMarks) {

		switch(totalMarks)
		{
			case 100:
			case 99:
			case 98:
			case 97:
			case 96:
			case 95:
			case 94:
			case 93:
			case 92:
			case 91:
			case 90:System.out.println(" Your Grade is A+");break;
			case 89:
			case 88:
			case 87:
			case 86:
			case 85:
			case 84:
			case 83:
			case 82:
			case 81:
			case 80:System.out.println("Your Grade is A");break;
			case 79:
			case 78:
			case 77:
			case 76:
			case 75:
			case 74:
			case 73:
			case 72:
			case 71:
			case 70:System.out.println("Your Grade is B+");break;
			case 69:
			case 68:
			case 67:
			case 66:
			case 65:
			case 64:
			case 63:
			case 62:
			case 61:
			case 60:System.out.println("Your Grade is B");break;
			case 59:
			case 58:
			case 57:
			case 56:
			case 55:
			case 54:
			case 53:
			case 52:
			case 51:
			case 50:System.out.println("Your Grade is C");break;
			case 49:
			case 48:
			case 47:
			case 46:
			case 45:
			case 44:
			case 43:
			case 42:
			case 41:
			case 40:
			case 39:
			case 38:
			case 37:
			case 36:
			case 35:System.out.println("Your Grade is D");break;
			default:System.out.println("Failed");
			
     	}
		return totalMarks;

	}
	public int gradesIfElse( int totalMarks) {
		if(totalMarks>=90 && totalMarks<=100)
			System.out.println(" Your Grade is A+");
		else if(totalMarks>=80 && totalMarks<=89)
			System.out.println(" Your Grade is A");
		else if(totalMarks>=70 && totalMarks<=79)
			System.out.println(" Your Grade is B+");
		else if(totalMarks>=60 && totalMarks<=69)
			System.out.println(" Your Grade is B");
		else if(totalMarks>=50 && totalMarks<=59)
			System.out.println(" Your Grade is C");
		else if(totalMarks>=35 && totalMarks<=49)
			System.out.println(" Your Grade is D");
		else
			System.out.println("Failed");
	
		return totalMarks;
			
	}
}
	


