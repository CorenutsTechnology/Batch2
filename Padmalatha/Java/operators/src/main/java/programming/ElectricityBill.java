package programming;
import java.util.*;
public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no.of units consumed");
		int units=scanner.nextInt();
		if(units<=50)
		{
			System.out.println("Bill:"+units*2+" Minimum Usage");
		}
		else if(units<=100)
		{
			System.out.println("Bill:"+units*5+" Moderate Usage");
		}
		else
		{
			System.out.println("Bill:"+units*8+" High Usage");
		}

	}

}
