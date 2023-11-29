package Exception;

public class NotTrowNullException implements Array {

	public static void main(String[] args) {
		NotTrowNullException notTrowNullException=new NotTrowNullException();
		notTrowNullException.array();
	}

	@Override
	public void array() {
		try {
			String  Stringname="kalyani";
			for(int i=0;i<Stringname.length();i++) {
				System.out.print(Stringname.charAt(i));
				
			}
			System.out.println();
		}
			finally {
				System.out.println("StringIndexOutOfBoundsException");
			}
			}
		
	}


