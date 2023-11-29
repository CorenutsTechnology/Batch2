package Exception;

public class TryCatchHandleException implements ExceptionHandle {

	public static void main(String[] args) {
		TryCatchHandleException TryCatchHandleException=new TryCatchHandleException();
		TryCatchHandleException.calculator(20, 0);
	}

	@Override
	public void calculator(int value1, int value2) {
		try {
			int result=value1/value2;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		
		{
			System.out.println("Arthematical Exception"+e.getMessage());
			e.printStackTrace();
		}
		
	}

}
