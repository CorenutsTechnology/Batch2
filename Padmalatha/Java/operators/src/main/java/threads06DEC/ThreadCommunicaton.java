package threads06DEC;

public class ThreadCommunicaton {

	boolean value=false;
	
	synchronized void first()
	{
		System.out.println("Welcome to Bengalore");
		value=true;
		notify();
		System.out.println("Thread one is about to surrender lock");
		
	}
	synchronized void second()
	{
		while(!value)
		{
			try {
				System.out.println("Thread2 waiting");
				wait();
				System.out.println("Thread2 running");
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Do visit Isckon Temple");
	}
	
	public static void main(String[] args) {
		
		 ThreadCommunicaton  tc=new  ThreadCommunicaton();
		 Thread t1=new Thread(()->tc.first());
		 Thread t2=new Thread(()->tc.second());
		 t2.start();
		 t1.start();
		 
		 
		
	}
	
}
