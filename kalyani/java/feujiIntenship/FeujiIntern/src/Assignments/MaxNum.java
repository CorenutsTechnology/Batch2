package Assignments;

public class MaxNum {

	public static void main(String[] args) {
		int num[]= {1,5,6,9,4};
		int max=num[0];
		for(int index=0;index<num.length;index++) {
		if(num[index]>max) {
			max=num[index];
		}
		}
			System.out.println(max);
		}
}
