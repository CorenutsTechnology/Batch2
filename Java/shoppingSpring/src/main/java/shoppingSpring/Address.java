package shoppingSpring;

public class Address
{
	private String address;
	
	public void init() {
		System.out.println("init in address class ");
	}
	public Address()
	{
		
	}
	public Address(String address) {
		super();
		this.address = address;
	}
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return address;
	}
	
	public void destroy() 
	{
		System.out.println("destroy in address class");
	}
		
}
