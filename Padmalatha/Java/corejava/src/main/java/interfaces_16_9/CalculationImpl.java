package interfaces_16_9;

public class CalculationImpl implements Calculation {

	CalculationImpl calculationImpl=new CalculationImpl();

	@Override
	public void calculate(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		// number=20; The final field Calculation.number cannot be assigned
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         CalculationImpl calculateImplimentation=new CalculationImpl();
         calculateImplimentation.calculate(10,20);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(number);
	}

}
