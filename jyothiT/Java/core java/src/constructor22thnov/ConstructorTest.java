package constructor22thnov;

import org.junit.jupiter.api.Test;

public class ConstructorTest {

	@Test
	void Test()
	{
	  Car vehicle=new Benz();
//	  vehicle.setType("petrol");
	  System.out.println(vehicle.getType());
	  try {
		  System.out.println(vehicle.getCar().type);
} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	  
	}
}
