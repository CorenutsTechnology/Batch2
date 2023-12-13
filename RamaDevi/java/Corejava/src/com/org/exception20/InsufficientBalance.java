package com.org.exception20;

public class InsufficientBalance extends Exception {
	String message;
public InsufficientBalance()
{
	System.out.println("Insuffiecet Balance");
}

public InsufficientBalance(String msg) {
	this.message=msg;
}
}
