package com.crnuts.classtest;

import com.crnuts.classes.Bird;
import com.crnuts.classes.Sparrow;

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
