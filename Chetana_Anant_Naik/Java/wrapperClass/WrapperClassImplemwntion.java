package wrapperClass;

public class WrapperClassImplemwntion {
public static void main(String[] args) {
	WrapperClassImplemwntion implemwntion=new WrapperClassImplemwntion();
	implemwntion.intImplemention();
}
void intImplemention() {
	int bigVlaue=10;
	int smallValue=654;
	System.out.println(Integer.min(smallValue, bigVlaue));
	
	
//	String name="dfg";
//	String name2="Dfg";
//	System.out.println(name.equalsIgnoreCase(name2));
	
	//print only  special caseses
	 
	String value="gfdsasdfgh45678";
	String result="";
	for(int index=0; index<value.length();index++) {
		char charvalue=value.charAt(index);
		boolean booleanvalue=Character.isLetterOrDigit(charvalue);
		if(booleanvalue!=true) {
		  result=result+charvalue;
		}	
	}
	if(result.isBlank()) {
		System.out.println("string not have a special case");
	}
	else {
		System.out.println("the special cases are "+result);
	}
	
	

	
}
}
