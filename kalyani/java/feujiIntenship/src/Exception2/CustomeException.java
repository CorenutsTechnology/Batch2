package Exception2;


public class CustomeException {
	public void psswordmatching(String pwd) throws CustomerException {
		try {
			String password = "Temp";
			if(pwd.equals(password)) {
				System.out.println("password is matched");
			}
			else {
				//throw new CustomerException("HelloException");
				//System.out.println("password is not matched");
				throw new CustomerException("missmatch Password");
				
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
			
		}
	}

}
