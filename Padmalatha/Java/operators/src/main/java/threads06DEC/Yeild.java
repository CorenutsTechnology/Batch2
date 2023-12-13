package threads06DEC;

public class Yeild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Yeild y=new Yeild();
		Thread th=new Thread(()->{ y.display();
		                          });
		Thread th1=new Thread(()->{
			                       y.play();
		                           });
		
		Thread th2=new Thread(()->{ y.eat();
			                        });

		th.start();
		th1.start();
		th2.start();
		
	}

  void display()
  {
	  Thread t=Thread.currentThread();
      System.out.println(t.getName());
      System.out.println("Hi!");
      System.out.println("Hello");
      System.out.println("calling yeild method");
      t.yield();
      System.out.println("After Calling yeild method");
      System.out.println(t.getName()+"I am done");
  }
   void play()
  {
	  Thread t=Thread.currentThread();
      System.out.println(t.getName());
      System.out.println(t.getName()+"I am done");
	  
  }
   void eat()
  {
	  Thread t=Thread.currentThread();
      System.out.println(t.getName());
  }
}
