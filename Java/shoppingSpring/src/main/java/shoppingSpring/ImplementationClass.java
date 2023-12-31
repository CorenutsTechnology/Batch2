package shoppingSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ImplementationClass
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("application-configuration.xml");
		Product product1 = (Product) beanFactory.getBean("product-1");
		System.out.println(product1);
	
		Product product2 = (Product) beanFactory.getBean("product-2");
		System.out.println(product2);
		
		Cart cart = (Cart) beanFactory.getBean("cart");//it is overloaded method
		System.out.println(cart);
		
		Product product3 = (Product) beanFactory.getBean("product");
		System.out.println("third product: \n"+product3);	
		
		
		beanFactory.registerShutdownHook();
	}
}
