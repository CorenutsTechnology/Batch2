package Opps;

public class Dog extends Animal  {
	String sound="barking";

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eating();
		dog.speaking();
		Animal animal=new Animal();
		animal.speaking();
		
	}
		public void eating() {
			System.out.println("food");
			System.out.println(sound);

	}

}
