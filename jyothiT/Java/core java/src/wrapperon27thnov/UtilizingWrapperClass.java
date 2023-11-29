package wrapperon27thnov;

public class UtilizingWrapperClass {
	
	static void wrapperClass()
	{
		Integer integer=100;
		Double double1=29.2;
		Long long1=2123334l;
		Character character='h';
	    Boolean boolean1=true;
	    
	    System.out.println(integer);
	    System.out.println(double1);
	    System.out.println(long1);
	    System.out.println(character);
	    System.out.println(boolean1);
	    System.out.println("************");
	    System.out.println(Integer.parseInt("101"));
	    System.out.println(Double.parseDouble("102.9"));
	    System.out.println(Boolean.parseBoolean("true"));
	    System.out.println(Character.MAX_RADIX);
	    System.out.println(Long.parseLong("101",2));
	    System.out.println(Integer.valueOf("1011", 2));
	   
	}
    
    public static void main(String[] args) {
    	
    	wrapperClass();
		
	}

}
