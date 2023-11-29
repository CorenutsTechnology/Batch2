package Exception2;

public class InsuffiaciantBalance  extends RuntimeException{

	public InsuffiaciantBalance() {
		super();
		
	}
	String stingname;
	public InsuffiaciantBalance( String stingname) {
		this.stingname=stingname;
		
	}

}
