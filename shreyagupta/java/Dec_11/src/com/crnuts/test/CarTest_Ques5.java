package com.crnuts.test;

import com.crnuts.classes.Car;
import com.crnuts.interfaces.CarInterface;

public class CarTest_Ques5 {
	
	public static void main(String[] args) {
		CarInterface part1= Car::starring;
		CarInterface part2= Car::seat;
		
		part1.carParts();
		part2.carParts();
		
		
	}

}
