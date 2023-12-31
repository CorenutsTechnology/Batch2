package december12.streams_Product;

import java.util.LinkedList;
import java.util.List;

import december12.streams_sir.Product;

public class FindCount 
{
	public static void main(String[] args) {
		List<Product> products = new LinkedList<>();
		products.add(new Product(1, "Mango", 100));
		products.add(new Product(2, "Banana", 50));
		products.add(new Product(3, "Amla", 200));
		products.add(new Product(4, "Gua", 50));
		products.add(new Product(5, "Apple", 200));
		products.add(new Product(6, "Grapes", 200));
		products.add(new Product(7, "Avacado", 100));
		
		long count=products.stream().filter((e)->e.getPrice()==50).count();
		System.out.println(count);
				
	}
}
