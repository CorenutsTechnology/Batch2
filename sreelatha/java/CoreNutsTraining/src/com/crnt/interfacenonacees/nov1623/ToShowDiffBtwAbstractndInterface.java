package com.crnt.interfacenonacees.nov1623;

public class ToShowDiffBtwAbstractndInterface implements CarInterface,SumInterface{
	public static void main(String[] args) {
		CarInterface c = new ToShowDiffBtwAbstractndInterface();
		SumInterface s = new ToShowDiffBtwAbstractndInterface();
		c.doors();
		c.engine();
		c.roof();
		s.sum(value1, value2);
	}

	@Override
	public void sum(int value1, int value2) {
		System.out.println("sum = "+(value1+value2));
	}

	@Override
	public void engine() {
		System.out.println("engine neceesary");
		
	}

	@Override
	public void roof() {
		System.out.println("roof is available");
		
	}

	@Override
	public void doors() {
		System.out.println("open the doors");
		
	}
	

}
