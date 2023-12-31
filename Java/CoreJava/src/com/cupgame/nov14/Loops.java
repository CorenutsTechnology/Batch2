package com.cupgame.nov14;

public class Loops 
{
	
	static void whileloop()
	{
		boolean flag = true;
		int i=0;
		while(flag)
		{
			System.out.println("loop"+i);
			int j=0;
			do {
				if(i==6)
				{
					System.out.println("6th iteration");
					continue;//break
				}
				i++;
				System.out.println("i=="+i+"j=="+j);
			}while(j++ < 10);
				flag=(i++ <= 10);
		}
		System.out.println("i="+i);
	}
//	public static void main(String[] args) {
//		whileloop();
//	}
	
	int whileloop2(int i)
	{
//		int i=0;
//		System.out.println(i);
		while(i<10)
		{
			if(i++ == 4)
			{
				break;
			}
			else{
				System.out.println("inside"+i);
			i++;
			}
		}
		System.out.println("outside"+i);
		return i;
	}
	void loop3()
	{
		
		int[] arr[]= {}, arr2= {};
		int arr3[]= {} ,arr4= 0;
		int[] []arr5[]= {} , arr6[]= {};
		
		System.out.println(arr.getClass());
		System.out.println(arr2.getClass());
		System.out.println(arr3.getClass());
		System.out.println(arr4);
//		int i = 0;
//		for(i = 0; i < 10; i++){
//			break;
//		}
//		System.out.println(i);
	}
}
