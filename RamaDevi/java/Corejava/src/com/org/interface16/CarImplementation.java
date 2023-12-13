package com.org.interface16;
 interface Car {
int gears=4;
void steering();
void engine();

}
 interface CarParts
{
	void tiers();
	void airbags();
}

public class CarImplementation implements Car,CarParts{

	public void steering()
	{
		System.out.println("start driving");
	}
	public void engine()
	{
		System.out.println("must specify the engine");
	}
	public void tiers()
	{
	System.out.println("four tiers ");	
	}
	public void airbags()
	{
		System.out.println("automatically opened");
	}
	public static void main(String[] args) {
		CarImplementation carImplementation=new CarImplementation();
		carImplementation.airbags();
		carImplementation.engine();
		carImplementation.steering();
		carImplementation.tiers();
		System.out.println(Car.gears);
	}

}
