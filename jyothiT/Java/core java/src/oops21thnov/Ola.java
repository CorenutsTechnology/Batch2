package oops21thnov;

public class Ola {
	
	public void ride(int price)
	{
		System.out.println("ride by "+price);
	}
	public void ride(String location)
	{
		System.out.println("ride by "+location);
	}
	public void ride(Animal obj)
	{
		obj.noise();
	}
	public static void main(String[] args) 
	{
		Ola concept=new Ola();
		concept.ride(100);
		concept.ride("whitefield");
		concept.ride(new Dog());
	}
	

}
