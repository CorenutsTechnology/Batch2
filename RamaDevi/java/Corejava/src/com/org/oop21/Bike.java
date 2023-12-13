package com.org.oop21;

public class Bike extends Engine {
	public void color() {
		System.out.println("color in Bike");
	}

	public void speed() {
		System.out.println("speed in bike");
	}

	@Override
	public void feul() {
		System.out.println("feul in Bike");
	}

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.color();
		bike.feul();
		Engine engine = new Engine();
		engine.feul();
//	Engine engine1=new Bike();
//	engine1.feul();
//	engine1.speed();
		// runtime
		Bike bike1 = (Bike) new Engine();
		bike1.color();
	}
}
