package com.SpringIoc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.main.Address;
import com.spring.main.School;
import com.spring.main.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("application.config.xml"));
//       Student student= (Student) beanFactory.getBean("student");
//       System.out.println(student);
//       System.out.println(student.getsName());
       
    ApplicationContext context=new ClassPathXmlApplicationContext("application.config.xml");
     Student student1=  (Student) context.getBean("student");
     System.out.println(student1.getName());
     Student student2=  (Student) context.getBean("student1");
     System.out.println(student2.getName());
     Address a1=(Address) context.getBean("address");
     System.out.println(a1);
     School school= (School) context.getBean("school");
     System.out.println(school);
      
     
    }
}
