package november;

import java.util.Arrays;
import java.util.Scanner;

public class CupBoloon {
public static void main(String[] args){// {https://blog.testproject.io/2019/02/26/junit-5/
	Scanner sc =new Scanner(System.in);
	int[] team1=new int[5];
	int[] team2=new int[5];
	int[] team3=new int[5];
	int[] team4=new int[5];
	int[] team5=new int[5];
	int count1=0;
	System.out.println("enter the 5 results of team1");
	for(int index=0;index<team1.length;index++) {
		team1[index]=sc.nextInt();
		if(team1[index]==1) {
			count1++;
		}
	}
	int count2=0;
	System.out.println("enter the 5 results of team2");
	for(int index=0;index<team2.length;index++) {
		team1[index]=sc.nextInt();
		if(team1[index]==1) {
			count2++;
		}
	}
	int count3=0;
	System.out.println("enter the 5 results of team3");
	for(int index=0;index<team2.length;index++) {
		team1[index]=sc.nextInt();
		if(team1[index]==1) {
			count3++;
		}
	}
	int count4=0;
	System.out.println("enter the 5 results of team4");
	for(int index=0;index<team2.length;index++) {
		team1[index]=sc.nextInt();
		if(team1[index]==1) {
			count4++;
		}
	}
	int count5=0;
	System.out.println("enter the 5 results of team5");
	for(int index=0;index<team2.length;index++) {
		team1[index]=sc.nextInt();
		if(team1[index]==1) {
			count5++;
		}
	}
//	System.out.println(count1+""+count2+""+count3+""+count4+""+count5);
	
	int result[]= {count1,count2,count3,count4,count5};
	Arrays.sort(result);
   if(result[result.length-1]==count1) {
	   System.out.println("The winning team is team1");
   }else if(result[result.length-1]==count2){
	   System.out.println("The winning team is team2");
   }
   else if(result[result.length-1]==count3){
	   System.out.println("The winning team is team3");
   }else if(result[result.length-1]==count4){
	   System.out.println("The winning team is team4");
   }else if(result[result.length-1]==count5){
	   System.out.println("The winning team is team5");
   }
}
}
