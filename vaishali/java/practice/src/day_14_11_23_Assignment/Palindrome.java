package day_14_11_23_Assignment;

public class Palindrome {

	public void palindrome(int number) {
		int result=0;
		int temp=number;
		while (number!=0) {
			int reminder=number%10;
			result=result*10+reminder;
			number=number/10;
		}
		if(temp==result) {
			System.out.println(temp+" is palindrome number");
		}
		else {
			System.out.println(temp+" is not a palidrome number");
		}
	}
	
	public static void main(String[] args) {
		Palindrome palindrome=new Palindrome();
		palindrome.palindrome(34543);
	}

}
