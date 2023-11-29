package Assignments;

public class MaxAndMinUsingArray {

	public static void main(String[] args) {
		int num[]= {10,6,2,4,9,5};
		int max=num[0];
		for(int index=0;index<num.length;index++) {
			
			if(num[index]>max) {
				max=num[index];
			}}
				System.out.println("maxmim"+max);
		
	
		
				int min=num[0];
		
		for(int index1=0;index1<num.length;index1++) {		
		if(num[index1]<min) {
			min=num[index1];
		}
		}
			System.out.println("minimum"+min);
		
	}
}


