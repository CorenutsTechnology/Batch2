package Assignments;

public class PrimeNumUsingWhileLoop2 {

	public static void main(String[] args) {
		int num=1;
		while(num<=100) {
			if(nonprime(num)) {
				System.out.println(num);
			}
			num++;
		}
			

}
	 public static	boolean nonprime(int num) {
			int fact=0;
			for(int index=1;index<=num; index++) {
				if(num%index==0) {
					fact++;
				}
			}
			return(fact!=2);
			
			
		}
}

