package asslgntment3_Loops;

public class nonPrime_While {

	public static void main(String[] args) {
		nonPrime_While nonprime_while=new nonPrime_While();
//		nonprime_while.nonPrimeWhileLoop();
		nonprime_while.nonPrimeDoWhileLoop();
		
	       }
	public void nonPrimeWhileLoop() {
	    int i=1; 
	    int c=0;
		while(c<=100)
	       {int fc=0;
	    		 int j=1;
	    			 while (j<=i) {
	    	                if (i % j == 0)
	    					{
	    						fc++;
	    	                }
	    	                j++;
	    					}
	    					if(fc!=2)
	    					{
	    						
	    		System.out.println(i);
	    	   
	    		 }
	    					 c++;
	    		 i++;			
	    	 }
	}
	public void nonPrimeDoWhileLoop() {
		  int i=1; 
		  int c=0;
		  do {
			  int fc=0;
	    		 int j=1;
	    			 while (j<=i) {
	    	                if (i % j == 0)
	    					{
	    						fc++;
	    	                }
	    	                j++;
	    					}
	    					if(fc!=2)
	    					{
	    						
	    		System.out.println(i);
	    	   
	    		 }
	    					 c++;
	    		 i++;	
		  }while(c<=100);
	}
	}





