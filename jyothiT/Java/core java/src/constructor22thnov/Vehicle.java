package constructor22thnov;

public class Vehicle {
	
	String type;
	Car Car;
	
	public Car getCar() {
		return Car;
	}



	public void setCar(Car car) {
		Car = car;
	}



	public Vehicle() {
		System.out.println("default vehicle");
	}
	
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
