package oops21thnov;

public class Bike extends Engine
{

	private Engine engine;
	
	public Bike(Engine engine) 
	{
		this.engine=engine;
	}
	
	public static void main(String[] args) {
		
		Bike bike=new Bike(new Engine());
		bike.engineMethod();
	}
	
	
}
