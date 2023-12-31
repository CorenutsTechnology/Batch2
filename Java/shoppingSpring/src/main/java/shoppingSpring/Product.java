package shoppingSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Product 
{
	private String name;
	private Address address;
	private long price;
	private int id;
	
	public Product()
	{
		System.out.println("constructor...");
	}
	
	public Product(String name, Address address, long price, int id) {
		super();
		this.name = name;
		this.address = address;
		this.price = price;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	@Qualifier("address-2")
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", address=" + address + ", price=" + price + ", id=" + id + "]";
	}
	
	
}
