package asslgntment3_Loops;

public class Pattern13Program {

	public static void main(String[] args) {
		{ int star=10; 
		for(int index=1;index<=8;index++)
		{
		for(int index1=1;index1<=star;index1++){

		System.out.print("* ");
		
		}
		System.out.println();
		if(index<=3)
		star=star-2;
		else 
			star--;
		

	}
}
	}

}
