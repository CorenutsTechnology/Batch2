package stringclass24thnov;

public class ReverseAWords {
	
	String s=new String("CoreNuts Technologies Pvt Ltd");
	String reverseString="";
	void reverse()
	{
		for(int i=s.length()-1;i>=0;i--)
		{
	       char ch=s.charAt(i);
	       reverseString+=ch;
	       
		}
		System.out.println(reverseString);
	}
	
	void reverseEachWord()
	{
      String words[]=s.split(" ");
      for(int i=0;i<words.length;i++)
      {
          String word=words[i];
          String reversedWord="";
    	 for(int j=word.length()-1;j>=0;j--) 
    	 {
    		 reversedWord=reversedWord+word.charAt(j);
    		 
    	 }
    	 reverseString=reverseString+reversedWord+" ";
      }
      System.out.println(reverseString);
      
      }
	}


