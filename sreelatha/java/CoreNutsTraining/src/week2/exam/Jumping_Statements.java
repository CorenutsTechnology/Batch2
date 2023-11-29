package week2.exam;

public class Jumping_Statements {
	public static void main(String[] args) {
		   int x = 2;
		    int y = 0;
		    for ( ; y < 10; ++y)
		    {
		      if (y % x == 0)
		         continue;
		      else if (y == 9)
		         break;
		      else
		        System.out.print(y + " ");
		    }
	}

}
