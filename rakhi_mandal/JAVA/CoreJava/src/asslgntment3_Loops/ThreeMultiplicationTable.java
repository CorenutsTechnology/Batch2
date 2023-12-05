package asslgntment3_Loops;

public class ThreeMultiplicationTable {

	public static void main(String[] args) {
		ThreeMultiplicationTable threeMultiplicationTable=new ThreeMultiplicationTable();
		System.out.println("Using For Loop :");
		threeMultiplicationTable.multiplyForLoop();
		System.out.println("Using While Loop :");
		threeMultiplicationTable.multiplyWhileLoop();
		System.out.println("Using Do While Loop :");
		threeMultiplicationTable.multiplyDoWhile();
	}
	public void multiplyForLoop()
	{
		for(int index=1;index<=10;index++)
			{   if((3*index)%2!=0)
				{
				   System.out.println(3+"x"+index+"="+3*index);
				}
			
				}
			    
			}
	public void multiplyWhileLoop()
	{  
		int index=1;
		while(index!=10)
			{   if((3*index)%2!=0)
				{
				   System.out.println(3+"x"+index+"="+3*index);
				}
			   index++;
				}
			    
			}
	public void multiplyDoWhile()
	{  
		int index=1;
		
		do	{   if((3*index)%2!=0)
				{
				   System.out.println(3+"x"+index+"="+3*index);
				}
			   index++;
				}while(index!=10);
			    
			}
		}

		
	


