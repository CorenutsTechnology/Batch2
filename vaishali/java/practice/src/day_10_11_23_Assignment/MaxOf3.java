package day_10_11_23_Assignment;

public class MaxOf3 {

	public void maximum(int value1,int value2,int value3) {
		if((value1>value2) && (value1>value3)) {
			System.out.println(value1+" is greatest number");
		}
		else if(value2>value3) {
			System.out.println(value2+" is greatest number");
		}
		else {
			System.out.println(value3+" is greatest number");
		}
	}
	
	public static void main(String[] args) {
		MaxOf3 max=new MaxOf3();
		max.maximum(4,12,2);
	}

}
