package wrapperon27thnov;

public class StringToPrimitiveValue {
	
  public static void main(String[] args) {
	  
	  String str="10";
	  
	  Integer integer=new Integer(str);
	  System.out.println(integer);
	  
	  Long long1=new Long(str);
	  System.out.println(long1);
	  
	  Byte byte1=new Byte(str);
	  System.out.println(byte1);
	  
	  Short short1=new Short(str);
	  System.out.println(str);
	  
	  Float float1=new Float(str);
	  System.out.println(float1);
	  
	  Double double1=new Double(str);
	  System.out.println(double1);
	  
//	  Character character=new Character(str);
//	  System.out.println(character);
	  
	  Boolean boolean1=new Boolean(str);
	  System.out.println(boolean1);
	  
//	 NumberFormatException
	  
	  String stringValue="30corenuts";
	  
	  Integer integerString=new Integer(stringValue);
	  System.out.println(integerString);
	  
	  
	  
		}	

}
