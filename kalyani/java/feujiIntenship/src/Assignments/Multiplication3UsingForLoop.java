package Assignments;

public class Multiplication3UsingForLoop {

	public static void main(String[] args) {
		int num=3;
			for(int index=1;index<=10;index++){
				int result=num*index;
				if(result%2==1) {
					System.out.println(num+"x"+index+"="+result);
				}
		}

	}

}

