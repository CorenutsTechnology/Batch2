package com.crnt.nov0623;
class Animal
{
	public void food()
	{
		System.out.println("Animals needs food...");
	}
}
class Lion extends Animal{
	public void hunt()
	{
		System.out.println("LIon hunts every animal in the forest...");
	}
}

public class InheritenceDebugging {
	public static void main(String[] args) {
		Lion lion = new Lion();
		
		lion.food();
		lion.hunt();
		
		
	}
	//f5 means if next line contains method then it will redirect into method
	//f6 if next line is invoking method it doesn't go to that method

}
