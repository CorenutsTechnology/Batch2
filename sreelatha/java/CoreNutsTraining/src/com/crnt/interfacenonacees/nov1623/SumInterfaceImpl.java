package com.crnt.interfacenonacees.nov1623;

public class SumInterfaceImpl implements SumInterface {
	public static void main(String[] args) {
		 SumInterfaceImpl sumInterfaceImpl = new SumInterfaceImpl();
		 sumInterfaceImpl.sum(value1, value2);
	}

	@Override
	public void sum(int value1, int value2) {
		int sum = value1+value2;
		System.out.println(sum);
	}

}
