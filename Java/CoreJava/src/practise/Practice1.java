package practise;

public class Practice1 extends Hum
{
	
	@Override
	void m1() {
		
		System.out.println("p");
	}

	public static void main(String...args) {
		Hum obj = new Practice1();
		obj.m1();
	}
}
