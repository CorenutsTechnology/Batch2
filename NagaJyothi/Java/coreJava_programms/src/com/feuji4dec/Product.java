package com.feuji4dec;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparator<Product>
{
	private String company;
	private int price;
    public Product() {
		
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public Product(String company, int price) {
		super();
		this.company = company;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [company=" + company + ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(company, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(company, other.company) && price == other.price;
	}
	@Override
	public int compare(Product o1, Product o2) {
		
		return o1.getPrice()>o2.getPrice()?1:-1;
	}
	

}
