package oops21thnov;

public class Test {
	
	@org.junit.jupiter.api.Test
	void dogTest()
	{
		Dog d=new Dog();
//		d.noise();
	}
	
	@org.junit.jupiter.api.Test
	void abstractionTest()
	{
		ImplementionAbstractionInterface implementation=new ImplementionAbstractionInterface();
//		implementation.calculator();
	}
	
	@org.junit.jupiter.api.Test
   void encapsulationTest()
	{
		EncapsulationConcept encapsulation=new EncapsulationConcept();
//        System.out.println(encapsulation.getPassword());
//        encapsulation.setPassword(167590);
//        System.out.println(encapsulation.getPassword());
	}
	
	@org.junit.jupiter.api.Test
	void catTest()
	{
		Cat c=new Cat();
//		c.noise();
	}
	
	@org.junit.jupiter.api.Test
    void carTest()
	{
		Car c=new Car();
//		c.engine();
		Audi a=new Audi();
//		a.engine();
	}
	
	@org.junit.jupiter.api.Test
    void multilevelTest()
	{
		Benz b=new Benz();
		b.engine();
		b.gear();
		b.stearing();
		
	}
}
