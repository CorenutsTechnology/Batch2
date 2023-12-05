//w I
package com.crnts.solid;

public class Crow implements FlyingBird, WalkingBird {
	public void fly() {
		System.out.println("can fly");
	}

	public void walk() {
		System.out.println("can walk");
	}

	@Override
	public void display() {
		System.out.println("pic here");
	}
}
