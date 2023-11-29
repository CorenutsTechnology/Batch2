package com.vahicle;

public class MainClass {
public static void main(String[] args) {
	Vahicle vahicle=new Car();
	vahicle.vahicle();
	vahicle.vahicle("car", 543456789);
	
Car car=(Car) vahicle;
car.vahicle("car");

}
}
