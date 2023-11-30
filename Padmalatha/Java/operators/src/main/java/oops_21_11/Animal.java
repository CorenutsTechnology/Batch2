package oops_21_11;

public class Animal {
     public String colour="Black";
     protected int legs=3;
     public void run() {
    	 System.out.println("Animal run method");
     }
     public Animal getAnimal()
     {
    	 return new Animal();
     }
     public Animal getAnimal(Animal a,Animal a1)
     {
    	 return new Animal();
     }
     
   /*  public void bark()
 	{
 		System.out.println("Dog Barks");
 	}*/
	@Override
	public String toString() {
		return "Animal Class";
	}
     
     
}
