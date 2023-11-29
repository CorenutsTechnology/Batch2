package Exception;

public class MultipleException implements Array {

	public static void main(String[] args) {
		MultipleException multipleException=new MultipleException();
		multipleException.array();
	}

	@Override
	public void array() {
		try {
			int array[] = { 2, 3, 4 };
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[3]);
			}
			int value=25/0;
			System.out.println(value);
		} catch (ArrayIndexOutOfBoundsException |ArithmeticException e) {
			System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
		}
		
		
	}

}
