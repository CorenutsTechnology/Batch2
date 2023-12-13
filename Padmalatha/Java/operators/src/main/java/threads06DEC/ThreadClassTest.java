package threads06DEC;

public class ThreadClassTest {
	public static void main(String[] args) {
		
		//Using Thread Class
		ThreadClass th=new ThreadClass();
		th.start();
		
		//Printing Thread name
		PrintThreadName printThreadName=new PrintThreadName();
		printThreadName.start();
		
		//Using Runnable interface
		//1.Way
		Run r=new Run();
		Thread th1=new Thread(r);
		th1.start();
		
		//2.way
		Thread th2=new Thread(new Runnable () {
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread1 is running.");
			}
		}
		);
		th2.start();
		
		//5Question display 1-100 slow
		Displaying dis=new Displaying();
		dis.start();
	}

}
