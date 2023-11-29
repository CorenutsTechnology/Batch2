package november;

public class fibonocciPattern_16 {
	public static void main(String[] args) {
		int f1 = 0;
		int f2 = 1;
		
		System.out.print( f2 + " ");

//	for(int index=0;index<10;index++) {
//		for(int index1=0;index1<=index;index1++) {
//						for(int index3=f1;index3>index;index3++) {
//			int f3=f2-f1;
//			 System.out.print(f3+" ");
//			 f1=f2;
//			 f2=f3;
//			
//		}
//			 break;
//		}
//		System.out.println();
//	}
		for (int index = 1; index <=5; index++) {
			int f3 = f2 + f1;
			System.out.print(f3 + " ");
			for (int index1 =1; index1 <=10; index1++) {
				for (int index3 = 1; index3 <=5; index3++) {
					f1 = f2;
					f2 = f3;
					
				}
				break;
			}
			System.out.println();
		}
	}

}
