package nov15th;

public class CreatingObjectForAbstractClass extends DeclaringAbstractClass {

	@Override
	void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub method");
		
	}
	
//	DeclaringAbstractClass object=new DeclaringAbstractClass() ; we cant create an object for abstract class
	
	public static void main(String[] args) {
		
		CreatingObjectForAbstractClass object=new CreatingObjectForAbstractClass();
		object.sub();
		add();
		
	}
		
		
		
		
		
		

}
