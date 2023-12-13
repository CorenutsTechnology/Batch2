package threads06DEC;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {

	public static void main(String[] args) {
		ExecutorService eS=Executors.newFixedThreadPool(2);
		
			for(int i=1;i<=4;i++)
			{
				Demo d=new Demo();
				eS.execute(d);
				
			}
			
			
			//Callable is same as Runnable but callable has the ability to return anything means "Generic"
			Callable cal=()->{
				return "Hello";
			};
			
			Future future=eS.submit(cal);
			Future f=eS.submit(()->{ return "Hi";});
			try {
				String s=(String) future.get();
				String s1=(String) f.get();
				System.out.println(s);
				System.out.println(s1);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
			eS.shutdown();
			
	}
}
class Demo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<5;i++)
		{	
		  System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
	
}