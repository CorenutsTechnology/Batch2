package december12.streams_Product;

import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import december12.streams_sir.Product;

public class ConvertToMap 
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
		
		//to directly print
		products.stream().collect(Collectors.toMap(Product::getId,e->e)).entrySet().forEach((e)->System.out.println(e));
	   
		Set<Entry<Integer, Product>> entryset = products.stream().collect(Collectors.toMap(Product::getId,e->e)).entrySet();
	   
	   for(Entry<Integer, Product> entry : entryset)
	   {
		   System.out.println(entry.getKey()+" -- "+entry.getValue());
	   }
	}
}
