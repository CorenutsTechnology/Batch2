package com.org.oops21;

public class DogClass extends AnimalClass{
	
	public void legs()
	{
		System.out.println("4 - legs for dog");
	}
	public void live()
	{
		System.out.println("lives in street");
	}
	public void hands()
	{
		System.out.println("hands in dog");
	}

	public static void main(String[] args) {
	AnimalClass animal=new AnimalClass();
	animal.name="lion";
	animal.legs();
	animal.live();
	System.out.println("****");
	DogClass dog=new DogClass();
	dog.live();
	dog.legs();
	System.out.println("****");
	AnimalClass animal1=new DogClass();
	animal1.legs();
	animal1.live();
	System.out.println("****");
	//***complies but got run time  ClassCastException
     DogClass dog1= (DogClass) new AnimalClass();
	dog1.legs();
	dog1.live();
	System.out.println("*******");
//   	AnimalClass animal2=new DogClass();
//	animal2.hands();
	}

}
