package exceptionHandling_17_9;

public class HandlingInFinally {

	public static void main(String[] args) {
		String name=null;
		try {
			System.out.println("hello welcome:"+9/0);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
			System.out.println(name.length());
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("Null pointer exception handled successfully");
			}
		}
	}
}
