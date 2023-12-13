package threads06DEC;

public class PrintThreadName extends Thread {
	

   public void run()
   {
	   System.out.println(Thread.currentThread().getName());
   }
}
