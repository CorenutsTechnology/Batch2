package com.org.oop21;

public class MiniCar extends Audi {
public void minicarMethod()
{
	System.out.println("mini car method");
}
/*public void wheels() {
	System.out.println("wheels at mini car");
}
public void gears()
{
	System.out.println("gerars in mini car");
}*/
public static void main(String[] args) {
	MiniCar mini=new MiniCar();
	mini.gears();
	mini.wheels();
}
}
