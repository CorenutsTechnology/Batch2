package Assignments;

public class binnerysort {

	public static void main(String[] args) {
		int a[]= {1,4,5,8,10};
		int ele=4;
		int f=0;
		int l=a.length-1;
		int mid=(f+l/2);
		while(f<=l) {
			if(ele==a[mid]) {
				System.out.println("element is found");
				break;
			}
			else if(ele>a[mid]) {
				f=mid+1;
			}
			else {
				l=mid-1;
			}
			mid=(f+l)/2;
			}
		if(f>l) {
			System.out.println("element  is not  found");
		}
		
	}
	}


