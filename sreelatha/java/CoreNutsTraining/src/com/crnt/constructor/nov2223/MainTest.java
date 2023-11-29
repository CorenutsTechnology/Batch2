package com.crnt.constructor.nov2223;

public class MainTest {
	public static void main(String[] args) {
		Vehical vehical = new Vehical();
		vehical.setType("bus");
		vehical.setNoOfWheels(4);
		System.out.println(vehical.getType());
		System.out.println(vehical.getNoOfWheels());
		
		TwoWheeler twoWheeler = new TwoWheeler("bike",2);
		System.out.println("two wheeler =no of wheels :  "+twoWheeler.getNoOfWheels()+ " :  type: "+twoWheeler.getType());
		/*
		 * twoWheeler.setType("scooter"); twoWheeler.setNoOfWheels(2);
		 * 
		 * System.out.println(twoWheeler.getNoOfWheels());
		 * System.out.println(twoWheeler.getType());
		 */
		TwoWheeler twoWheeler2 = new TwoWheeler("bike",2);
		Vehical vehical2 = new Vehical("truck", twoWheeler );
		vehical2.setType("bus");
		vehical2.setNoOfWheels(4);
		vehical2.setTwoWheeler(twoWheeler2);
//		twoWheeler2.setVehical(vehical2);
		System.out.println(vehical2.toString());
		/*
		 * Vehical vehical3 = new Vehical("car" ,twoWheeler);
		 * 
		 * twoWheeler.setVehical(vehical3);
		 * 
		 * System.out.println(twoWheeler.getVehical().getType());
		 */
	}

}
