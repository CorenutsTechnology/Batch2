package threads06DEC;

public class Synchronized_Non implements Runnable{
	
	public static int amount=10000;
	
	public synchronized void withdraw(int value)
	{
		amount-=value;
		System.out.println("Synchronized method"+amount);
		for(int i=1;i<4;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
	public void deposit(int value)
	{
	   	amount+=value;
	   	System.out.println("Non Synchronized"+amount);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		withdraw(100);
	}

}
