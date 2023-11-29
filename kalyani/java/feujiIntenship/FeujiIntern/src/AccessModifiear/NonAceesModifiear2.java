package AccessModifiear;

public class NonAceesModifiear2  extends NonAccessModifiear{

	public static void main(String[] args) {
		NonAceesModifiear2 NonAceesModifiear2=new NonAceesModifiear2();
		NonAceesModifiear2.method();
		System.out.println(NonAceesModifiear2.Stringname);
		System.out.println(NonAceesModifiear2.num);
		
	}

	@Override
	public void method() {
		System.out.println("method()");
		
	}

	@Override
	public  void method1() {
		// TODO Auto-generated method stub
		
	}
	
	//@Override cannot over ride the final method
//	public void method1() {
		//System.out.println("method1()");
		
	//}
}
