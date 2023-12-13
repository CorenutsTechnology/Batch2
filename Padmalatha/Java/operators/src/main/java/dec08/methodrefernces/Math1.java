package dec08.methodrefernces;

public class Math1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Sum s=(a,b)->{
    	  return a+b;
      };
      System.out.println( s.add(3, 4));
      
      Sum s1=new Math1()::add;
      System.out.println(s1.add(10,20));
     
	}

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
