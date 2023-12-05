package arrays;

public class StringArray {

	public static void main(String[] args) {

      String stringArray[]=new String[4];
      StringArray classObject=new StringArray();
      classObject.stringValues(stringArray);
      

	}private void stringValues(String[] stringArray)
	{
		stringArray[0]="rakhi";
		stringArray[2]="mandal";
		
		System.out.println(stringArray[3]);//null
	}
	
	


}
