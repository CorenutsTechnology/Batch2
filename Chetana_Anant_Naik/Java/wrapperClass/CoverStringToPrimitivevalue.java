package wrapperClass;

public class CoverStringToPrimitivevalue {//THIS IS POJO OR BEAN CLASS
public static void main(String[] args) {
	CoverStringToPrimitivevalue coverStringToPrimitivevalue=new CoverStringToPrimitivevalue();
	coverStringToPrimitivevalue.coverStringToPrimitivevalue();
}
 void coverStringToPrimitivevalue(){
	 int intvalue=14;
		System.out.println(intvalue+13);
		String stringvalue=String.valueOf(intvalue);
		System.out.println(stringvalue+13);
		
		
		char charvalue='c';
		System.out.println(charvalue+'c');
		System.out.println(charvalue+0);
		System.out.println(charvalue);
		String stringvalue1=String.valueOf(charvalue);
		System.out.println(stringvalue1+'c'+1);
		

		boolean booleanValue=true;
		System.out.println(booleanValue);
		String stringvalue2=String.valueOf(booleanValue);
		System.out.println(stringvalue2+true);
		
 }
}
