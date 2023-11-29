package Interface;

public  class calculator implements Calculate {

	public static void main(String[] args) {
		calculator calculator=new calculator();
		calculator.calculator(10, 20);
		
	}

	@Override
	public void calculator( int value1, double value2) {
		System.out.println( "result" +(value1+value1));
		
		
	}

}
