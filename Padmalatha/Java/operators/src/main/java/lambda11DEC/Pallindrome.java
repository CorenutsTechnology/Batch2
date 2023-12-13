package lambda11DEC;

import java.util.function.Predicate;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="boob";
         Predicate p=(s1)->{ String s3=(String)s1;
        	  String s2="";
              for(int i=0;i<s3.length();i++)
              {
            	 s2=s3.charAt(i)+s2; 
              }
              
              System.out.println(s3.equals(s2));
        	 return s3.equals(s2);};
        	 
        	 p.test(s);
	}
    
}
