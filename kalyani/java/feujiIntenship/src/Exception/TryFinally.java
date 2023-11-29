package Exception;

public class TryFinally implements Tryfinally1 {

	public static void main(String[] args) {
		TryFinally tryFinally=new TryFinally();
		tryFinally.Tryfinally();
	}

	@Override
	public void Tryfinally() {
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