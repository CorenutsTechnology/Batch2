package Assignments;
import java.util.Scanner;
public class CapGame {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	int value=sc.nextInt();
	int value1[]=new int [value];
	for(int index=0;index<value1.length;index++) {
		
	System.out.println("enter the value of a["+index+"]");
		value1[index]=sc.nextInt();
		
	}
	int result=team1(value1);
	System.out.println(result);
	}
	public static int team1(int[] value1) {
		int result=0;
		for(int index=0;index<value1.length;index++) {
			if(value1[index]==0) {
				break;
			}
			result++;
			
			
		}
		return result;
		
	}

	}


