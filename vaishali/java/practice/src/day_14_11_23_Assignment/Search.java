package day_14_11_23_Assignment;

public class Search {

	public void sequentialSearch(int intArray[]) {
		int value=5;
		boolean flag=false;
		for (int index = 0; index < intArray.length; index++) {
			if(intArray[index]==value) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println(value+" is present in array");
		}
		else {
			System.out.println(value+" is not present in an array");
		}
	}
	
	public void binarySearch() {
		int intArray[]= {3,2,8,12,9};
		int value =12;
		int firstIndex=0;
		int lastIndex=intArray.length-1;
		int mid=(firstIndex+lastIndex)/2;
		while(firstIndex<=lastIndex) {
			if(intArray[mid]==value) {
				System.out.println(value+" is present in array");
				break;
			}
			else if(intArray[mid]<value) {
				firstIndex=mid+1;
			}
			else {
				lastIndex=mid-1;
			}
			mid=(firstIndex+lastIndex)/2;
		}
		if(firstIndex>lastIndex) {
			System.out.println(value+" is not present in an array");
		}
	}
	
	public static void main(String[] args) {
		int intArray[]= {13,2,8,3,5,7};
		
		Search search=new Search();
		
		search.sequentialSearch(intArray);
		
		search.binarySearch();
	}

}
