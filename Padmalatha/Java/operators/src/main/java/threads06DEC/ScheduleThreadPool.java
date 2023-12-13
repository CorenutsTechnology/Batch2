package threads06DEC;

import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScheduledExecutorService eS=Executors.newScheduledThreadPool(2);
		//Future<String> f=eS.submit(()->{ return "Callable";});
		//eS.schedule(()->System.out.println("runnable"),10,TimeUnit.SECONDS);
		//eS.scheduleAtFixedRate(()->System.out.println("runnable 1"), 0, 10,TimeUnit.SECONDS);
		eS.scheduleWithFixedDelay(()->System.out.println("runnable delay"), 0, 10, TimeUnit.SECONDS);
		
		
	}

}
