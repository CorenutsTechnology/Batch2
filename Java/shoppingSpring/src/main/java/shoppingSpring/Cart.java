package shoppingSpring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cart implements InitializingBean,DisposableBean 
//these are functional interfaces , which are used to get init and destroy methods, witout defining in xml file
{
	private int id;
	private String name;
	private List<Product> products;
	
	private Map<String,Product> map;
	
	public Map<String, Product> getMap() {
		return map;
	}
	public void setMap(Map<String, Product> map) {
		this.map = map;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + ", products=" + products + ", map=" + map + "]";
	}


	@Override
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("init method started in cart class");
	}


	@Override
	public void destroy() throws Exception 
	{
		System.out.println("destroy method started in cart class");
	}
	
	
}
