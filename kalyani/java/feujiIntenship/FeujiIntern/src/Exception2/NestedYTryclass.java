package Exception2;

public class NestedYTryclass implements NestedTry {

	@Override
	public void nestedTry() {
		// TODO Auto-generated method stub

	}

	public void nested1() {
		String name = null;
		int array1[] = { 1, 2, 4 };
		try {
			try {
				System.out.println(array1[array1.length]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(name.length());
		}
		catch (NullPointerException e) {
			System.out.println(e);

		}
	}
}
