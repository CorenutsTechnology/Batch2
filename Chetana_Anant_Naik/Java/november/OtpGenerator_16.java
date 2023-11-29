package november;

import java.util.Random;

public class OtpGenerator_16 {
public static void main(String[] args) {
	Random random=new Random();
		int value=random.nextInt(10000);
		int copy=value;
		System.out.println(value);
		int count=0;
		while(value>0) {
			int rem=value%10;
			count++;
			value=value/10;
		}
		if(count<4) {
			System.out.println(0+""+copy);
		}
		else {
			System.out.println(copy);
		}
}
}

