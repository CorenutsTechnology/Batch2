
public class TerinaryOperators 
{
	public static void main(String[] args)
	{
		int a=10,b=20;
		float max = (true)?a:b;
		System.out.println(max);
		int c=30,d=5;
		System.out.println((a>b)?(a>d?a:d):(b>d?b:d));;
//		System.out.println(max1);
		//String str=null;
		String forest = null;
		String output = forest != null ? "Goblin" : "Amazon";
		System.out.println(output);
		int x=10;
		double y = x+10;
		System.out.println("y: "+y);
		float f =(float) (10 + y);
		System.out.println("f: "+f);
		int p =(int)(y+f);
		System.out.println("p: "+p);
	}
}
