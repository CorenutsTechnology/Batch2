package oops_22_11;

public class FourWheeler extends Vehicle{

	public FourWheeler() {
	
		System.out.println("Default FourWheeler Constructor");
	}

	public FourWheeler(String type) {
		System.out.println("FourWheeler :"+type);
	}
	
	public static void main(String[] args) {
		
		FourWheeler fourWheeler=new FourWheeler("car");
	}
	

}
