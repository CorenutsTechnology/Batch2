package asslgntment3_Loops;

public class Pattern11Program {

	public static void main(String[] args) {
		Pattern11Program pattern11Program =new Pattern11Program();
		System.out.println("Pattern with n=5");
		pattern11Program.pattern_5();
		System.out.println();
		System.out.println("Pattern with n=7");
		pattern11Program.pattern_7();
	}
	public void pattern_5()
	{
		for(int index=1;index<=5;index++)
		{   
			for(int index1=1;index1<=5;index1++)
			{
				System.out.print("#");
				
			}System.out.println();
			
		}

	}
	public void pattern_7()
	{
		for(int index=1;index<=7;index++)
		{   
			for(int index1=1;index1<=7;index1++)
			{
				System.out.print("#");
				
			}System.out.println();
			
		}

	}

}
