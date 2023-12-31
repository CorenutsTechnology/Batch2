package shoppingSpring;

public class DeliveryAddress
{
	private Address address;
	private int id;
	private Cart cart;
	
	@Override
	public String toString() 
	{
		return "DeliveryAddress [address=" + address + ", id=" + id + ", cart=" + cart + "]";
	}
		
}
