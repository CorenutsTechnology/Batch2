package wrapperClass;

public class WrappervalueToWapperclassobject extends Exception{
	public static void main(String[] args) {
		WrappervalueToWapperclassobject  wrappervalueToWapperclassobject =new WrappervalueToWapperclassobject();
		wrappervalueToWapperclassobject.wrappervalueToWapperclassobject();
	}
	void wrappervalueToWapperclassobject() {
		int intvalue=new Integer(10);
		System.out.println("WRAPPER CLASS OBJECT ");
		System.out.println(intvalue);
		
		char charvalue=new Character('C');
		System.out.println("WRAPPER CLASS OBJECT ");
		System.out.println(charvalue);
		
		boolean booleanvalue=new Boolean(false);
		System.out.println("WRAPPER CLASS OBJECT ");
		System.out.println(booleanvalue);
		
		double doublevalue=new Double(978.97);
		System.out.println("WRAPPER CLASS OBJECT ");
		System.out.println(doublevalue);

		
	}
}
