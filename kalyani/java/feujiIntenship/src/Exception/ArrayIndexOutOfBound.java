package Exception;

public class ArrayIndexOutOfBound implements Array {

	public static void main(String[] args) {
		ArrayIndexOutOfBound ArrayIndexOutOfBound = new ArrayIndexOutOfBound();
		ArrayIndexOutOfBound.array();
	}

	@Override
	public void array() {

		try {
			int Array[] = { 2, 3, 4 };
			for (int i = 0; i < Array.length; i++) {
				System.out.println(Array[3]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
		}

	}

}
