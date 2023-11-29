package com.crnt.constructor.nov2223;

import java.io.FileInputStream;

public class ExceptionDog extends ExceptionAnimal {
	public void checked() throws Exception
	{
		FileInputStream file = new FileInputStream("D:\\SpringBoot_workspace\\CoreNutsTraining\\bin\\week2\\exam");
	}
	public void unChecked()
	{
		int result= 100/0;
	}
}
