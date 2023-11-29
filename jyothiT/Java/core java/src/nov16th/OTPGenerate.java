package nov16th;

import java.util.Random;

public class OTPGenerate {

	public static void main(String[] args) {
     
		Random random=new Random();
		int otp=random.nextInt(10000);
		int copyOtp=otp;
		int count=0;
		while(copyOtp>0)
		{
		    int reminder=copyOtp%10;
			count++;
			copyOtp=copyOtp/10;
			
		}
//		System.out.println(count);
         if(count==4)
         {
        	 System.out.println(otp);
         }
         else 
         {
        	 System.out.println(otp*10);
         }
         
         
	}

}
