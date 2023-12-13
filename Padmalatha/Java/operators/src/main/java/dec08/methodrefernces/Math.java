package dec08.methodrefernces;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class Math {
	
	public static void multiple()
	{
		System.out.println("Welcome to method reference");
		//return a*5;
	}
	Math()
	{
	   System.out.println("Hello! This is math");
	}
	public void print(Object a)
	{
		System.out.println(a);
	}
	public Object print1()
	{
		return "supplier";
	}
	public Message print2()
	{
		return null;
	}
	public static void main(String[] args) {
	    
		Print p=Math::multiple;
		p.print();
		Math math=new Math();
		Display d=math::print;
		d.display(30);
		Consumer c=math::print;
		c.accept(10);
		 Supplier s=math::print1;
           s.get();
           
          Message m=Math::new;
          m.getMessage();
	}

}
interface Print{
	void print();
}
interface Display{
	 void display(int a);
}
interface Message{
   void getMessage();
}