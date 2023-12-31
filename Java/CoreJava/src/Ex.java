
public class Ex {

	 int ab=10;
	public Ex() {
		
	}
	
//	 public static void main(String args[]) {
//	        int index = 1;
//	        for(; index <= 10;)
//	            System.out.print(index);
//	            index++;
//	    }
	
	
//	public static void printPattern(int patternValue) {
//        int outerIndex, innerIndex;
//        int num = 1;
//        for (outerIndex = 1; outerIndex <= patternValue; outerIndex++) {
//            for (innerIndex = 1; innerIndex <= outerIndex; innerIndex++) {
//                System.out.print(num + " ");
//            }
//           break;
//            System.out.println();
//        }
//    }
//
//    public static void main(String args[]) {
//        int patternValue = 5;
//        printPattern(patternValue);
//    }
	public static void main(String args[])
	  {
		f(9);
	//	int[] h = new int[-9];System.out.println(h[-1 ]);
		
		char ws=7;
		System.out.println(ws);
		
		switch(ws)
		{
		case 9:{
//			break;
			System.out.println("hi");
		}
		case 6:{
			System.out.println("h8i");
			break;
		}
		}
		String str ="";
		boolean s =str.equals(null);
		System.out.println((s!=false)?"hi":"hello");
	    int x = 2;
	    int y = 0;
	    x =4;
	    System.out.println(x);
	  final long l= 123456789;
	    for ( ; y < 10; ++y)
	    {
	      if (y % x == 0)
	         continue;
	      else if (y == 8)
	         break;
	      else
	        System.out.print(y + " ");
	    }
	    
	 }
	public static void f(int...arr)
	{
		System.out.println(arr[0]);
	}
}
