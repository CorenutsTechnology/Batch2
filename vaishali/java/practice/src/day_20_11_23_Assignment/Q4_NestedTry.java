package day_20_11_23_Assignment;

import day_15_11_23.Person;

public class Q4_NestedTry {

	public static void main(String[] args) {
		Q4_NestedTry nestedTry=new Q4_NestedTry();
		nestedTry.nestedTry(21, 0,new int[]{});
		
	}

	public void nestedTry(int value1,int value2,int intArray[]) {
		int result=0;
		Person person=null;
		try {
			try {
				 result=(value1/value2)/intArray[0];
				 try {
					System.out.println(person.age);
				} catch (Exception e) {
					System.out.println("inner most Exception : "+e);
				}
			}
			catch (Exception e) {
				System.out.println("inner Exception : "+e);
			}
		} catch (Exception e) {
			System.out.println("outer Exception : "+e);
		}
		System.out.println("result : "+result);
	}
}
