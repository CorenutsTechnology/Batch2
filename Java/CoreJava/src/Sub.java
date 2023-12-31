
public class Sub extends Inherit
{
	int ab;
	Sub(){
		
		this(10);
	}
	Sub(int ab){
		super(10);
		this.ab=ab;
	}
//	public void drive(String o)
//	{
//		
//	}
	
	public static void main(String[] args) {
		Sub s = new Sub();
	}
	@Override
	public Sub drive(Inherit s) {
		return new Sub();
		// TODO Auto-generated method stub
//		super.drive(s);
	}
}
