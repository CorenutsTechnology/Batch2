package com.feuji30nov;

public class ProductDetails  implements Comparable<ProductDetails>
{
	private String company;
	private int price;
	private String type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ProductDetails [company=" + company + ", price=" + price + ", type=" + type + "]";
	}
	public ProductDetails(String company, int price, String type) {
		super();
		this.company = company;
		this.price = price;
		this.type = type;
	}
	//compare based on one parameter if we use another parameter we will modify the code.
	
	@Override
	public int compareTo(ProductDetails product) {
		if(this.getPrice()>product.getPrice()&&(this.getPrice()>product.getPrice())) {
		return 1;
		}
		else if(this.getPrice()<product.getPrice())
		{
			return -1;
		}
		return 0;
		
	}
	

}
