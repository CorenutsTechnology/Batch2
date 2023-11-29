package Exception;

public class Multiplicatch implements Array {

	public static void main(String[] args) {
		
		Multiplicatch multiplicatch=new Multiplicatch();
		multiplicatch.array();
	}

	@Override
	public void array() {
		
		try {
			String Stringname=null;
			for(int i=0;i<Stringname.length();i++) {
				
			}
			System.out.println(Stringname.length());
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException"+e.getMessage() );
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException"+e.getMessage());
		}
		try {
			int value=25/0;
			
			System.out.println(value);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException"+e.getMessage() );
		}
	}

}
