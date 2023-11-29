package stringclass24thnov;

public class TokenizedString {
	
	String str="corenuts technology pvt ltd";

	void tokenize()
	{
		String[] tokenzied=str.split(" ");
		for(int i=0;i<tokenzied.length;i++)
		{
			System.out.println(tokenzied[i]);
		}
	}

}
