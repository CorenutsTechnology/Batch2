package threads06DEC;

public class Join implements Runnable{
	/* The join() method of a Thread instance is used to join the start of a thread’s execution to 
	 * the end of another thread’s execution such that a thread does not start running until 
	 * another thread ends. If join() is called on a Thread instance, the currently running thread 
	 * will block until the Thread instance has finished executing. The join() method waits at 
	 * most this many milliseconds for this thread to die. A timeout of 0 means to wait forever 
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Join y=new Join();
		Thread t=new Thread(y);
		t.start();
		t.join(1000);
		System.out.println("Joining after 1000 millseconds");
		System.out.println(t.getName());
		System.out.println("IsAlive"+t.isAlive());
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread th=Thread.currentThread();
		System.out.println(th.getName());
		System.out.println("IsAlive:"+th.isAlive());
	}

}
