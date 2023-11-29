package Assignments;
import java.util.Random;

public class GenerateOTP {

	public static void main(String[] args) {
		Random random=new Random();
		int value=random.nextInt(9999);
		
		if(value>999) {
		System.out.println("OTP " +value);
	}
		else if(value>99) {
			System.out.println("OTP "+0+value);
		}
		else  if(value>9) {
			System.out.println("OTP"+0+0+value);
		}
		else {
			System.out.println("OTP"+0+0+0+value);
		}

}
}
