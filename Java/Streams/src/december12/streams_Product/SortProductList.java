package december12.streams_Product;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import december12.streams_sir.Product;

public class SortProductList {
	public static void main(String[] args) {

		List<Product> products = new LinkedList<>();
		products.add(new Product(1, "Mango", 100));
		products.add(new Product(2, "Banana", 50));
		products.add(new Product(3, "Amla", 200));
		products.add(new Product(4, "Gua", 50));
		products.add(new Product(5, "Apple", 200));
		products.add(new Product(6, "Grapes", 200));
		products.add(new Product(7, "Avacado", 100));
		
		products.forEach((e)->System.out.println(e));
		
		System.out.println("\nascending order based on name");
		
		products.stream().sorted(new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().compareTo(o2.getName());
//				return -o1.getName().compareTo(o2.getName()); // for descending order
				
			}
			
		}).forEach((e)->System.out.println(e));;
//		products2.forEach((e)->System.out.println(e));
	}
}
