package constructor22thnov;

public class TwoWheeler extends Vehicle 

{
	String type;
	
	public TwoWheeler() {
		System.out.println("default twowheeler");
	}
	public 	TwoWheeler(String type,Vehicle vehicle)
	{
		this.type=type;
		
	}

}
