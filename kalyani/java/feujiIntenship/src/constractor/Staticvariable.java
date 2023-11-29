package constractor;

public class Staticvariable {
	static int value;
	public Staticvariable(int value) {
		this.value=value;
	}

	public static void main(String[] args) {
		Staticvariable staticvariable=new Staticvariable(20);
		System.out.println(staticvariable.value);
	}

}
