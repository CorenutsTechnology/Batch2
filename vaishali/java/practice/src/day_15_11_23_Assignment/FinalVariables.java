package day_15_11_23_Assignment;

public class FinalVariables { 
	
	public final static int staticValue=10;
	public final int nonStaticValue=15;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int localValue=20;
		
//		FinalVariables.staticValue=20;//final variables can not be reinitialized
		
		FinalVariables variables=new FinalVariables();
		
//		variables.nonStaticValue=30; //final variables can not be reinitialized
		
//		localValue=40;//final variables can not be reinitialized
		
		
	}

}
