package december11.method_references;

import java.util.function.Supplier;

public class Product 
{
	public Product() {
		
	}
	public static void main(String[] args) 
	{
		Interface obj = Product::new;
		System.out.println(obj.i);
	}
}
//Supplier<Test2> math2 = Test2 :: new; // for constructor