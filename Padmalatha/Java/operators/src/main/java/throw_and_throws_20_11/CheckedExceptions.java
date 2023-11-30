package throw_and_throws_20_11;

import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckedExceptions ce=new CheckedExceptions();
		try {
		  ce.first();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	public void first() throws FileNotFoundException
	{
		second();
	}
	public void second() throws FileNotFoundException
	{
		throw new FileNotFoundException();
	}
}
