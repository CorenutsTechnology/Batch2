package com.cnts.nov21;

public class Dog1 extends Animal1 {

	
	public Dog1(String name)
	{
		super(name);
	}
	
	@Override
	public void eat() {           //we can override parent method only if it is public,protected and default in same package
		System.out.println("Dog eat fruits , vegitable and meat");
	}
	
	@Override
	public void speak() {
		System.out.println("Dog Barks....");
	}
	
	public static void main(String[] args) {
		Animal1 animal = new Dog1("Pojo");
		System.out.println("Dog name is "+animal.getName());
		animal.eat();
		animal.speak();
	}
	
	@Override
	public Animal1 method1() {
		// TODO Auto-generated method stub
		return super.method1();
	}
	
	@Override
	public void method2(Animal1 animal) {
		// TODO Auto-generated method stub
		super.method2(animal);
	}
	
	@Override
		public Dog1 method3(Animal1 animal) {
			// TODO Auto-generated method stub
			return super.method3(animal);
		}
	
	
}
