package asslgntment3_Loops;

public class nonPrime_ForLoop {

	public static void main(String[] args) {
		nonPrime_ForLoop nonPrime_forloop =new nonPrime_ForLoop();
		nonPrime_forloop.value();
  
	}
	public void value()
	{
	     for(int i=1;i<=100 ;i++)
	       {
	    		 { int fc=0;
	    			 for (int j = 1;j<=i ; j++) {
	    	                if (i % j == 0)
	    					{
	    						fc++;
	    	                }
	    					}
	    					if(fc!=2){
	    						{
	    		System.out.println(i);
	    	    }
	    		 }
	    	 }
	       }
	}

}


