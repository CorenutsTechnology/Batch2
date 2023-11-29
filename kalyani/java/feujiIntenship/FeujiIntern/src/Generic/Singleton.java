package Generic;

public class Singleton {
	private Singleton() {
		
	}
	public void hi() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		Singleton Singleton=new Singleton();
	}

}
