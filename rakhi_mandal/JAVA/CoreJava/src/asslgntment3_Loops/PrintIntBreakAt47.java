package asslgntment3_Loops;

public class PrintIntBreakAt47 {

	public static void main(String[] args) {
		PrintIntBreakAt47 printIntBreakAt47=new PrintIntBreakAt47();
		printIntBreakAt47.values();
	}
	public void values()
	{
		for(int index=1;index<=100;index++)
		{
			if(index==47)
			{
				break;
			}
			else{System.out.println(index);}
		}
	}
}
