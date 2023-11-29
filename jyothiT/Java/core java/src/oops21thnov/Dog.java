package oops21thnov;

public class Dog extends Animal 
{
   public void noise()
   {
	   System.out.println("boww bow");
	  
	  
   }
   
   void d()
   {
	   System.out.println("d");
   }
   
   public static void main(String[] args) {
	Animal a1=new Dog();
	a1.noise();
   
//	Dog d1=(Dog) new Animal();
//	d1.noise();
}
}
