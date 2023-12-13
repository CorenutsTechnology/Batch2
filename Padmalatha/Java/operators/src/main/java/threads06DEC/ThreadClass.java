package threads06DEC;

public class ThreadClass extends Thread{

	public void run()
	{
		for(int i=1;i<11;i++)
		{
			System.out.println("5 * "+i+" = "+5*i);
		}
	}
}
