package day_14_11_23_Assignment;

import java.util.Random;

public class InfiniteLoop {

	public static void main(String[] args) {
		Random random=new Random();
		
		while(true) {
			System.out.println(random.nextInt());
		}
	}

}
