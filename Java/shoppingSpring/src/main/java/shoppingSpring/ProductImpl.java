package shoppingSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ProductImpl 
{
	public static void main(String[] args) 
	{
		// beanfactory object created using Xmlbeanfactory
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-configuration.xml"));
		 //product class is a singleton class, only one time constructor is executed
		//if the scope is prototype(in xml file) , then constructor will execute 2 times
		Address bean = (Address) beanFactory.getBean("address");
		 Product bean2 = (Product) beanFactory.getBean("product");
		 Product bean3 = (Product) beanFactory.getBean("product");
		
		 System.out.println(bean2);
		 
		 // beanfactory object created using Applicationcontext
//		 ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-configuration.xml");
//		 Address address= (Address) classPathXmlApplicationContext.getBean("address");
//		 Product product = (Product) classPathXmlApplicationContext.getBean("product");
//		 System.out.println(product);
		 
	}
}
