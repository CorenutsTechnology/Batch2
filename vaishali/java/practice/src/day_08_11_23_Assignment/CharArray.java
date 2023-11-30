package day_08_11_23_Assignment;

public class CharArray {

	public static void main(String[] args) {
		CharArray charArray=new  CharArray();
		System.out.println(charArray.characterArrayMethod(0,null));
	}
	public String characterArrayMethod(int index,String name) {
		char[] charValue= {'v','a','i','s','h','a','l','i'};
		if(charValue.length!=index) {
			name=charValue[index]+"";
			index++;
			return name+characterArrayMethod(index,name);
		}
		return "";
	}
}
