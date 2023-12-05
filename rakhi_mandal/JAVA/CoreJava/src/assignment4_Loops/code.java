package assignment4_Loops;
public class code {
public static void main(String[] args) {
	int[] array= {66,41,59,66,44,5};
	System.out.println("Array before sorting :");
    for(int index=0;index<array.length;index++)
    {
    System.out.print(array[index]+ " ");
    } System.out.println();
	selectionSort(array);
	System.out.println("Array after sorting using Selection Sort :");
    for(int index=0;index<array.length;index++)
    {
    	System.out.print(array[index]+ " ");
    }
}
public static void selectionSort(int array[])
{ for(int index=0;index<array.length;index++)
	{    int minIndex=index;
		for(int index1=index+1;index1<array.length;index1++)
		{    
			if(array[index1]<array[minIndex])
			{
				minIndex=index1;
			}
		}
     int temporary=array[index];
		array[index]=array[minIndex];
		array[minIndex]=temporary;	
	}}}
