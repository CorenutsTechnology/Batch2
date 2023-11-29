package week2.exam;

public class Question3 {
	public static void main(String[] args) {
		int patternValue=5;
		printPattern(patternValue);
		
	}
	public static void printPattern(int patternValue)
	{
		int outerIndex,innerIndex;
		int num=1;
		for ( outerIndex = 0; outerIndex <=patternValue; outerIndex++) {
			for ( innerIndex = 0; innerIndex <=outerIndex; innerIndex++) {
				
				System.out.print(num+" ");
				num++;
				
			}
			//break;
			System.out.println();
			
		}
	}

}
