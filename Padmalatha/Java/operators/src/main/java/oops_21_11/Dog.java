package oops_21_11;

public class Dog extends Animal{
	public String colour="White";
	  protected int legs=4;
	@Override
	public void run() {
   	 System.out.println("Dog run method");
    }
	
	@Override
	 public Dog getAnimal()
     {
    	 return new Dog();
     }
	@Override
	 public Dog getAnimal(Animal a1,Animal a2) //if we pass arguments as DOg reference it will give compile time error
    {
   	 return new Dog();
    }
	
	public void bark()
	{
		System.out.println("Dog Barks");
	}
	@Override
	public String toString() {
		return "Dog Class";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal animal=new Dog();
        System.out.println(animal.colour);
        System.out.println(animal.legs);
        // animal.bark();  The method bark() is undefined for the type Animal,Animal does n't contain bark method
        animal.run();
        System.out.println(animal.getAnimal());
        Dog dog=new Dog();
        System.out.println(dog.colour);
        System.out.println(dog.getAnimal());
   
       /* 
        * Dog dog1=(Dog)new Animal();  
        * java.lang.ClassCastException:
        * reason:downcasting can be done on only upcasted elements;
          dog1.bark();
       */
	}

}
