package Assignments;

public class Multiplication3UsingWhileLoop2 {

	public static void main(String[] args) {
		int num=3;
		int num1=1;
		while(num1<=10){
			
				int result=num*num1;
				
				if(result%2==1) {
					System.out.println(num+"x"+num1+"="+result);
					
				}
				num1++;
		}

	}

}

