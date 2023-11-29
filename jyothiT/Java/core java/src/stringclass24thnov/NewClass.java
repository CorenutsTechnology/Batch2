package stringclass24thnov;

public class NewClass {
	
//	it will not extends because those classes are final classes
	
	void count()
	{
		String str="corenuts technology";
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
//					System.out.println(ch[i]);
					break;
				}
			}
			
		}
		System.out.println(count);
		
		
	}
	void convertString()
	{
		int value=10;
//		System.out.println(Integer.toString(value));
		System.out.println(String.valueOf(value));
	}

}
