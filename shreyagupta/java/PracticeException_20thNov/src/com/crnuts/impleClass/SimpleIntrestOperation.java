package com.crnuts.impleClass;

import java.io.FileNotFoundException;


import com.crnuts.impleClass.SimpleIntrestException;

public class SimpleIntrestOperation  {
	


	
	public double operation(double principle, double rateOfIntrest, double time) throws RuntimeException{
		
		
			if(principle<=0) {
				throw new SimpleIntrestException("Princlple should not be zero or lesser");
			}
			if(rateOfIntrest<=0) {
				throw new SimpleIntrestException("Rate of intrest should not be zero or lesser");
			}
			if(time<=0) {
				throw new SimpleIntrestException("Time should not  be zero or lesser");
			}
			
			double result = (principle * rateOfIntrest * time) / 100;
			System.out.println("Simple intrest is"+ result);
		return result;

	}

}
