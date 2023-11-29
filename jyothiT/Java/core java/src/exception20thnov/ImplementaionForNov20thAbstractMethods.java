package exception20thnov;

public class ImplementaionForNov20thAbstractMethods implements Nov20thAbstractMethods {
	
	
	
	public void throwingCheckedException() throws ArithmeticException
	{
		int result=10/0;
	    System.out.println(result);
	}


	public void raisingUserDefinedException(int age) throws InvalidAgeException {
		if(age<18)
		{
			try {
				throw new InvalidAgeException("age is not valid for voting");

			} catch (InvalidAgeException e) 
			{
			   System.err.println(e.getMessage());
			}
		}
		else
		{
			System.out.println("welcome for voting");
		}
		
	}


	

	@Override
	public void nestedTryStatements() {
		
		try {
			try {
				int arrayValue[]= {12,6};
				System.out.println(arrayValue[3]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				
			}
			int result=10/10;

		} catch (ArithmeticException e1) {
			System.out.println(e1.getMessage());

		}
		
	}


	@Override
	public void reThrowExceptionInCatchBlock() {
		
		try {
			int array[]= {1,2};
			System.out.println(array[2]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
	}


	@Override
	public void raisingUserDefinedExceptionInCatchBlock(int value1,int value2,int age)throws InvalidAgeException {
			try {
				int result=value1/value2;
				System.out.println(result);
				
			} catch (ArithmeticException e) {
				
				System.out.println(e.getMessage());
				if(age<18)
				{
			        throw new InvalidAgeException("age is not valid for voting");

				}
				else
				{
					System.out.println("welcome for voting");
				}

				}
			}
			
		
		
		
		
	}

	
	

	
	


