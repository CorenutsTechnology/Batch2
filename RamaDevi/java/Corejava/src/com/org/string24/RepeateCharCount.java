package com.org.string24;

public class RepeateCharCount {

	public static void main(String[] args) {
		String name="raamaa";
		char[] charArray=name.toCharArray();
		for(int index=0;index<name.length();index++)
		{
			int count=0;
		for(int innerindex=index+1;innerindex<name.length();innerindex++)
		{
			if(charArray[index]==charArray[innerindex]&&charArray[index]!=' ')
			{
				count++;
				charArray[innerindex]='0';
			}
		
    }  
    //A character is considered as duplicate if count is greater than 1  
    if(count > 1 && charArray[index] != '0')  
        System.out.println(charArray[index]); 
		}
	}

}
