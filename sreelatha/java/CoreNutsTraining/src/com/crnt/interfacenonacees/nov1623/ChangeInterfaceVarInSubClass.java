package com.crnt.interfacenonacees.nov1623;

public class ChangeInterfaceVarInSubClass  implements SumInterface {

	
	public static void main(String[] args) {
		ChangeInterfaceVarInSubClass c = new ChangeInterfaceVarInSubClass();
		c.sum(8, 2);//if we change the interface variable it will change
		
	}
	
	@Override
	public void sum( int value1, int value2) {
		System.out.println("sum="+(value1+value2));
		
	}

}
