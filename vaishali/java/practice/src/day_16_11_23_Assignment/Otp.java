package day_16_11_23_Assignment;

import java.util.Random;

public class Otp {

	public static void main(String[] args) {
		
		Otp obj=new Otp();
		
		Random random=new Random();
		int otp=random.nextInt(100000000);
		System.out.println("actual random number "+ otp);
		if(otp>=1000 && otp<=9999) {
			System.out.println("opt generated: "+otp);
		}
		else if(obj.digits(otp)==1) {
			System.out.println("opt generated: "+"000"+otp);
		}
		else if(obj.digits(otp)==2) {
			System.out.println("opt generated: "+"00"+otp);
		}
		else if(obj.digits(otp)==3) {
			System.out.println("opt generated: "+"0"+otp);
		}
		else if(otp>9999) {
			System.out.println("opt generated: "+obj.otpNumber(otp));
		}
		else if(otp<0) {
			String stringNumb=otp+"";
			stringNumb=stringNumb.substring(1);
			
		}
	}
	public int digits(int number) {
		int count=0;
		while(number!=0) {
			count++;
			number=number/10;
		}
		return count;
	}
	public int otpNumber(int number) {
		boolean flag=true;
		while(flag) {
			number=number/10;
			if(number>=1000 && number<=9999) {
				flag=false;
				break;
			}
		}
		return number;
	}

}
