package Assignments;

public class Ascending_DescendingOrder {

	public static void main(String[] args) {
		int value[]= {2,8,3,9,4,6};
		for(int index=0;index<value.length;index++) {
			for(int index1=index+1;index1<value.length;index1++) {
				if(value[index]>value[index1]) {
					int temp=value[index1];
					value[index1]=value[index];
					value[index1]=temp;
				}
			}
		}
		for(int index=0;index<value.length;index++) {
			System.out.println(value[index]);
		}
		
		
		
		
		for(int index=0;index<value.length;index++) {
			for(int index1=index+1;index1<value.length;index1++) {
		if(value[index]<value[index1]) {
			int temp=value[index1];
			value[index1]=value[index];
			value[index]=temp;
		}
	}
}
for(int index=0;index<value.length;index++) {
	System.out.print(value[index]);
}
	}

}
