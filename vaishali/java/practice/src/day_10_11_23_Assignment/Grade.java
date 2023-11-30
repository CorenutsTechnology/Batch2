package day_10_11_23_Assignment;

import java.util.Scanner;

public class Grade {

	public void switchCase(int marks) {
		switch (marks) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
		case 20:
			
		case 21:
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
		case 27:
		case 28:
		case 29:
		case 30:
			
		case 31:
		case 32:
		case 33:
		case 34:
			
		case 35: 
		case 36:
		case 37:
		case 38:
		case 39:
		case 40:System.out.println("fail");
			break;
		
		case 41:
		case 42:
		case 43:
		case 44:
		case 45:
		case 46:
		case 47:
		case 48:
		case 49:
		case 50: System.out.println("grade E");
			break;
			
		case 51:
		case 52:
		case 53:
		case 54:
		case 55:
		case 56:
		case 57:
		case 58:
		case 59:
		case 60: System.out.println("grade D");
			break;	
			
		case 61:
		case 62:
		case 63:
		case 64:
		case 65:
		case 66:
		case 67:
		case 68:
		case 69:
		case 70:System.out.println("grade C");
			break;
			
		case 71:
		case 72:
		case 73:
		case 74:
		case 75:
		case 76:
		case 77:
		case 78:
		case 79:
		case 80:System.out.println("grade B");
			break;
		
		case 81:
		case 82:
		case 83:
		case 84:
		case 85:
		case 86:
		case 87:
		case 88:
		case 89:
		case 90:System.out.println("grade A");
			break;
			
		case 91:
		case 92:
		case 93:
		case 94:
		case 95:
		case 96:
		case 97:
		case 98:
		case 99:
		case 100:System.out.println("grade O");
			break;
			
		default:System.out.println("enter proper marks");
			break;
		}
	}
	
	public void ifElse(int marks) {
		if(marks>=91 && marks<=100) {
			System.out.println("grade O");
		}
		else if(marks>=81 && marks<=90) {
			System.out.println("grade A");
		}
		else if(marks>=71 && marks<=80) {
			System.out.println("grade B");
		}
		else if(marks>=61 && marks<=70) {
			System.out.println("grade C");
		}
		else if(marks>=51 && marks<=60) {
			System.out.println("grade D");
		}
		else if(marks>=41 && marks<=50) {
			System.out.println("grade E");
		}
		else if(marks>=0 && marks<=40) {
			System.out.println("fail");
		}
		else {
			System.out.println("enter proper marks");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks : ");
		int marks=sc.nextInt();	
		
		Grade grade=new Grade();
		
		System.out.println("using switch case");
		grade.switchCase(marks);
		
		System.out.println("using if else");
		grade.ifElse(marks);
	}

}
