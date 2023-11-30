package programming;

public class FibonocciPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first=0,second=1,third;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				third=first+second;
				first=second;
				second=third;
				System.out.print(third+" ");
			}
			System.out.println();
		}
	}

}
