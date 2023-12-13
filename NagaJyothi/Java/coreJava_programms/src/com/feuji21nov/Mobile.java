package com.feuji21nov;

public class Mobile {
	private String company;
	private String colour;
	private int gb;
	private Battery battery;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getGb() {
		return gb;
	}

	public void setGb(int gb) {
		this.gb = gb;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public  Mobile acessingProperties()
	{
		Mobile result=new Mobile();
		result.setCompany("OnePlus");
		result.setColour("BhamusBlue");
		result.setGb(256);
		Battery bat=new Battery();
		bat.setCapacity(50);
		result.setBattery(bat);
		//battery.setCapacity(5000);
		return result;
		/*
		 * System.out.println(getCompany()); System.out.println(getColour());
		 * System.out.println(getGb());
		 */
		//System.out.println(battery);
		//System.out.println(battery.getCapacity());
	}
	public static void main(String[] args)
	{
		Mobile m1=new Mobile();
		Mobile result=m1.acessingProperties();
		System.out.println(result.getCompany());
		System.out.println(result.getColour());
		System.out.println(result.getGb());
		System.out.println(result.getBattery());
		//System.out.println(result.b);
		
	}

}
