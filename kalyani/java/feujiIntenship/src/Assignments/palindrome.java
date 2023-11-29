package Assignments;

public class palindrome {

	public static void main(String[] args) {
		int num=121;
		int temp=num;
		int rev=0;
		while(num!=0) {
			int result=num%10;
			rev=rev*10+result;
			num=num/10;
			
		}
		if(temp==rev) {
			System.out.println(temp+"is palindrome");
		}
		else {
			System.out.println(temp+"is not palindrome");
		}

	}

}
