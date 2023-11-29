package Exception2;

public class ExceedDepositeLimit  extends RuntimeException{

	public ExceedDepositeLimit() {
		super();
		
	}
	String Stringname;
	public ExceedDepositeLimit( String Stringname ) {
		this.Stringname=Stringname;
		
	}
}
