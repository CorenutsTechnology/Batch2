package Assignments;

public class LinearArray {

	public static void main(String[] args) {
		int Array[]= {2,4,6,8,9};
		int ind=-1;
		int ele=8;
		for(int index=0;index<Array.length;index++) {
			if(Array[index]==ele) {
				ind=index;
				break;
			}
			
		}
		if(ind==-1) {
			System.out.println("element is not found");
		}
		else {
			System.out.println(ele+"is founded");
		}
	}

}
