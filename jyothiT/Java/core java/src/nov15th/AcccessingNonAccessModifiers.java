package nov15th;

public class AcccessingNonAccessModifiers extends IncludesAllNonAccessModifiers {

	public static void main(String[] args) {
		
		AcccessingNonAccessModifiers access=new AcccessingNonAccessModifiers();
	     
		access.add();
	

}

	@Override
	void add() {
		// TODO Auto-generated method stub
		int value1=10;
		int value2=20;
		
		System.out.println(value1+value2+PI);
		
		
	}
}