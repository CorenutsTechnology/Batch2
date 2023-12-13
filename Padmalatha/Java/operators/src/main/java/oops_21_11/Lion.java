package oops_21_11;

public class Lion extends WildAnimal{

	@Override
	 public void run() {
    	 System.out.println("Lion run method");
     }
	

	public void attack()
	{
		System.out.println("Lion attacks humans");
	}
	
	public void print()
	{
		System.out.println("Lion is king of forest");
	}
	public static void main(String[] args) {
		
		Lion lion=new Lion();
		lion.run();
		lion.attack();
		lion.print();
		WildAnimal wa=new Lion();
		wa.run();
		wa.attack();
		//wa.print(); The method print() is undefined for the type WildAnimal
		
	}
}
