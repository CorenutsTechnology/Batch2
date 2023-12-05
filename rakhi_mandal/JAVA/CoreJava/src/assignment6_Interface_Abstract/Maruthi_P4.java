package assignment6_Interface_Abstract;

public class Maruthi_P4 implements Car_P4 {

	public static void main(String[] args) {
		Maruthi_P4 maruthi=new Maruthi_P4();
		System.out.println(medium);
		System.out.println(wheels);
		maruthi.name();
		maruthi.parent();
	}

	@Override
	public void name() {
		System.out.println("From Car class, implementaion given in maruthi");
	}

	@Override
	public void parent() {
		System.out.println("From Vehicle class,implementaion given in maruthi");
		
	}

}
