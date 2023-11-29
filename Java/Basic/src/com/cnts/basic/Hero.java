package com.cnts.basic;

public class Hero extends Vehicle
{
	public static void main(String[] args) {
		System.out.println("Child class");
		Vehicle vehicle = new Vehicle();
		vehicle.detail();
	}
}
