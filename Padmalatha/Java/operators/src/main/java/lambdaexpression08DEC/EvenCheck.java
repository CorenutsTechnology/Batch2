package lambdaexpression08DEC;

public class EvenCheck {

	public static void main(String[] args) {
		Even even=(a)->{if(a%2==0)
			               return true;
		                   return false;};
		                   
		  System.out.println(even.check(10));
	}
}
