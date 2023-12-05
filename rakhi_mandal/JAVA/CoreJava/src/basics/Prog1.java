//06-11-23
package basics;

//public class Prog1 extends Prog2 {
	public class Prog1 {
	
		public static void main(String [] args) {

			int n=13;
			if(prime(n))
					{
						System.out.println("It is  a prime num");
					}
					else
					{	
						System.out.println("It is  not a prime num");	
					}
//			show();
			
			}
		
			public static boolean prime(int n)
			{
			  int c=0;
			  for(int i=1;i<=n;i++)
			  {
				  if(n%i==0)
				  {  c++;
				  }
				  } return c==2;
			  }
			  
			}

