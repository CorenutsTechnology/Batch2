package programming;

public class Table3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int i=1;
	  while(i<11) {
			if((i*3)%2!=0)
			{
				System.out.println(i*3);
			}
			i++;
		}
	  System.out.println();
	  //using do while
	 int j=1;
	  do {
		  if((j*3)%2!=0){
			 System.out.println(j*3); 
		  }
		  j++;
	  }while(j<11);

	}

}
