package strings_24_11;

public class Strings {

	public static void main(String[] args) {
		
		String company=new String("CoreNuts Technologies Pvt Itd");
		//1)convert String characters to char array and then display them
		char[] array=company.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			//System.out.println(array[i]);
		}
		
		
		
		//2)Write a program to get substring "CoreNuts Technologies"
		String str1=company.substring(0,company.indexOf('P'));
		System.out.println(str1);
		
		//3)WAP to compare address of string objects
		System.out.println(company==str1);
		
		//4)WAP to compare string values instead of address of string objects
		System.out.println(company.equals(str1));
		
		//5)WAP to reverse a string in different ways
		String str2="padma";
		String st="";
		for(int i=0;i<str2.length();i++)
		{
			st=str2.charAt(i)+st;
		}
		System.out.println(st);
		
		//6)Write a program to reverse words instead of characters
		//7)WAP to split a string and display tokenized strings
		String[] stArray=company.split(" ");
		String reverse="";
		for(int i=0;i<stArray.length;i++)
		{
			reverse=stArray[i]+" "+reverse;
			System.out.println(stArray[i]);
		}
		System.out.println(reverse);
		
		//8)WAP using StringBuffer class to delete a String "Technologies" from company name
		StringBuffer company1=new StringBuffer("CoreNuts Technologies Pvt Itd");
		company1.replace(company.indexOf('T'), company.lastIndexOf('P'), "");
		System.out.println(company1);
		
		//9)WAP to insert Technologies in company1
		company1.insert(company1.indexOf(" "), " Technologies");
		System.out.println(company1);
		
		
		//11)Write a program to count repeated characters in a string 
		String s1="Hi! Hello,How Are You?";
		char[] s2=s1.toCharArray();
		for(int i=0;i<s2.length;i++)
		{
			int count=1;
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i]==s2[j]&&s2[j]!=' ')
				{
					count++;
					s2[j]='0';
		
				}
			}
			if(s2[i]!='0'&&count>1)
				System.out.println(s2[i]+" : "+count);
		}
		
		//12)convert primitive types to String
		System.out.println(company.valueOf(1));
		System.out.println(company.valueOf(1.23));
		System.out.println(company.valueOf(1.5f));
		System.out.println(company.valueOf('c'));
	
	}
	
}

