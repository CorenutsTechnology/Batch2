package december8.interfaces;

import java.util.function.Consumer;

public class ConsumerInterface
{
//	public void print(int n)
//	{
//		for(int i=1;i<=n;i++)
//		{
//			System.out.println(i);
//		}
//	}
	
	public static void main(String[] args) 
	{
//		new MainClass2().print(100);
		
		Consumer<Integer> p = (Integer n)->{
			for(int i=1;i<=n;i++)
			{
				System.out.println(i);
			}
		};
		
		p.accept(100);
		
		
	}
}
