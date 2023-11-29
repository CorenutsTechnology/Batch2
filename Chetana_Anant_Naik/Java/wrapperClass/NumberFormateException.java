package wrapperClass;

public class NumberFormateException  {
	public static void main(String[] args) {
		NumberFormateException numberFormateException=new NumberFormateException();
		numberFormateException.numberFormateException();
	}
	void numberFormateException() {
		int value=Integer.parseInt("NumberFormateException");//NumberFormatException
		System.err.println(value);
	}
	}