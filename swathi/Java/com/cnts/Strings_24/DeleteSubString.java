package com.cnts.Strings_24;
//program 8&9
public class DeleteSubString {
//	void deleteSubstring(StringBuffer stringBuffer, String substring) {
//        int index = stringBuffer.indexOf(substring);
//        while (index != -1) {
//            stringBuffer.delete(index, index + substring.length());
//            index = stringBuffer.indexOf(substring);
//        }
//    }
	public static void main(String[] args) {
		  StringBuffer stringBuffer = new StringBuffer("CoreNuts Technologies Pvt ltd.");
		  stringBuffer.delete(9, 21);
		  StringBuffer stringBuffer1 = new StringBuffer("CoreNuts Pvt ltd.");
		  stringBuffer1.insert(9, "Technologies");
//		  DeleteSubString   deleteSubString = new  DeleteSubString ();
//		  deleteSubString.deleteSubstring(stringBuffer, "Technologies"); 
	     System.out.println(stringBuffer.toString());
	     System.out.println(stringBuffer1.toString());
		  
		
	}

}
