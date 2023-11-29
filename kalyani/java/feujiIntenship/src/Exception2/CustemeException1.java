package Exception2;

public class CustemeException1 implements CustemException {

	@Override
	public void custemEception() {
		// TODO Auto-generated method stub
		
	}
	public void SimpleIntrest(int p,int t,int r) {
	double result=p*r*t/100;
	try {
	if(result<1000) {
		throw new CustomerException("Amount less");
		
	}
	else {
		System.out.println("sufficieant amount");
	}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
