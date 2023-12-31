package december12.streams_Product;

import java.util.LinkedList;
import java.util.List;

import december12.streams_sir.Product;

//to get 50rs product into one list
public class FilterOnProduct 
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
		
		products.stream().filter((e)->e.getPrice()==50).forEach((e)->System.out.println(e.getName()));
		
		List<Product> filteredList =products.stream().filter((e)->e.getPrice()==50).toList();
		System.out.println(filteredList);
		
		
	}
}
