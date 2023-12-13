package threads06DEC;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th=new Thread(new Synchronized_Non());
		Thread th1=new Thread(new Synchronized_Non());
        th.start();
        th1.start();
		System.out.println("Amount :" +Synchronized_Non.amount);
	}

}
