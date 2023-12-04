package com.crnuts.test;

import com.crnuts.entity.Bird;
import com.crnuts.entity.Sparrow;

public class LPStest {
	
	public static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Bird bird = new Bird();

        Sparrow sparrow = new Sparrow();

        
        makeBirdFly(bird);

        
        makeBirdFly(sparrow);
    }

}
