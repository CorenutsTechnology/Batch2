package Assignments;
import java.util.Scanner;
public class FiveSubjectmarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  array size as 5");
		int value=sc.nextInt();
		int  value1[]=new int[value];
		for(int index=0;index<value1.length;index++) {
		System.out.println("Enter marks"+value1[index]);
		value1[index]=sc.nextInt();
		}
		int max=value1[0];
		for(int index1=0;index1<value1.length;index1++) {
			if(value1[index1]>max) {
				max =value1[index1];
			}
			
			
		}
		System.out.println(" maximum"+max);
		int min=value1[0];
		for(int index1=0;index1<value1.length;index1++) {
			if(value1[index1]<min) {
				min =value1[index1];
			}
			
			
		}
		System.out.println("minimum"+min);
	
	double avg=0;
	for(int index1=0;index1<value1.length;index1++) {
	int sum=value1[0]+value1[1]+value1[2]+value1[3]+value1[4];
	avg=sum/5;
	

}
	System.out.println(" average"+avg);
	}	
}
