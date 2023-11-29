package Opps;

public class School  extends Stundent{

	public static void main(String[] args) {
		School   school =new School ();
		school.teacher();
		school.Uniform();
	

	}

	@Override
	public void Uniform() {
		System.out.println("blue");
		
	}
	public void teacher() {
		System.out.println("Mathus");
	}

}
