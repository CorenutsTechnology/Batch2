package nov16th;

public class Calculate implements CalculateInterface{

	@Override
	public void add() {
      
		int value1=20;
		int value2=10;
		System.out.println(value1+value2);
	}
	
	public static void main(String[] args) {
		
		Calculate c=new Calculate();
		c.add();
	}

}
