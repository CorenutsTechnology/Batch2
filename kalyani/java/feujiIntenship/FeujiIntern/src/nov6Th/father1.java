package nov6Th;

 class father {
	
		int a=10;
		 void method1() {
			System.out.println("Am1()"); 
		}
		}
		 class  son extends father{
			 int b=20;
			 void method1() {
					System.out.println("Bm2()"); 
				}
		 }

public class father1{
	
	public static void main(String[] args) {
		son obj=new son();
		 
		 System.out.println(obj.a);
		 obj.method1();
		 
	 }
	}


