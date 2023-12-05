package com.crnts.oops;

public class DogP1 extends AnimalP1 {
	AnimalP1 animalP1=new DogP1();
	public static void main(String[] args) {
		
		
	}
	public void parentMembers()
	{
		System.out.println(animalP1.legs);
		animalP1.lifeSpan();
		animalP1.typeOf();
	}

}
