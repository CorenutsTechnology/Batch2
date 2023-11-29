package wrapperClass;

public class BoxingAndUnboxing {
public static void main(String[] args) {
	BoxingAndUnboxing boxingAndUnboxing =new BoxingAndUnboxing();
	boxingAndUnboxing.BoxingAndUnboxing();
}
void BoxingAndUnboxing() {
	//Boxing
	Integer I1=new Integer(10);
	System.out.println(I1);
	int i1=I1;
	System.out.println(i1);
	
	Character C1=new Character('A');
	char c1=C1;
	System.out.println(c1);
	
	Double D1 =new Double(987.987);
	double d1=D1;
	System.out.println(d1);
	
	Boolean B1=new Boolean(false);
	boolean b1=B1;
	System.out.println(b1);
}
}
