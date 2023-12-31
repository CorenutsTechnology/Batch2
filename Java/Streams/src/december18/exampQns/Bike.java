package december18.exampQns;

import java.io.IOException;

public class Bike extends Vehicle
{

	@Override
	public void startEngine() throws BikeStartException
	{
		System.out.println("bike class");
		throw new BikeStartException("bike not started");
	}
	public static void main(String[] args) 
	{
		//case-1
		Vehicle vehicle = new Vehicle();
		try {
			vehicle.startEngine();
		} catch (IOException e) {
			
		}
		
		//case-2
		Bike bike = new Bike();
		try {
			bike.startEngine();
		} catch (BikeStartException e) {
			
		}
		
		//case-3
		Vehicle vehicle2 = new Bike();
		try {
			vehicle2.startEngine();
		} catch (IOException e) {
			
		}
				
	}
}
