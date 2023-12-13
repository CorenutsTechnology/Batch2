package oops_21_11;

public class Car {
	
	private Engine engine;
	
	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

    	

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}



	void openDoor()
	{
		System.out.println("Automatic door open");
	}
	
	public static void main(String[] args) {
		
		Car car=new Car(new Engine());
	    System.out.println(car);
	    
	}

}
