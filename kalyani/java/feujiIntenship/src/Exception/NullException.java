package Exception;

public class NullException implements Array {

	public static void main(String[] args) {
		NullException nullException=new NullException();
		nullException.array();
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
		
	}

}
