package Assignments;
import java.util.Random;
public class RandomValues {

	public static void main(String[] args) {
		Random random=new Random();
		for(int index=0;index<25;index++) {
		int value1=random.nextInt(100);
		int value2=random.nextInt(100);
		 if(value1>value2) {
			System.out.println(value1+"is greater than"+value2);
		}
		 else if(value1< value2) {
			 System.out.println(value1+"is lesser than"+ value2);
		 }
		 else {
			 System.out.println(value1+"is equals to"+value2);
		 }

	}

}
}
