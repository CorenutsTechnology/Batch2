package oops_22_11;

import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {

		SBI sbi = new SBI();
		try {
			sbi.interst();
		} catch (ArithmeticException e) {

		}
	}
}

class Bank {

	public void interst()  {
		System.out.println("interst method");
	}

	public void deposit() {
		System.out.println("deposit method");
	}

	public void withdraw() throws Exception {
		System.out.println("withdraw method");
	}

	public void checkBalance() throws Exception {
		System.out.println("Check Balance");
	}
}

class SBI extends Bank {
	@Override
	public void interst() throws RuntimeException {
		System.out.println("SBI interst method");
		// throw new NullPointerException();
		// For uncheckedException we will get the run time exception
	}

	
	/*
	 * @Override public void deposit() throws FileNotFoundException { //if we throw
	 * checkedException we will get compiletime error //Exceptio
	 * FileNotFoundException is not compatible with throws clause in Bank.deposit()
	 * System.out.println("SBI deposit method"); throw new FileNotFoundException();
	 * }
	 */
	  
	 
	public void withdraw() throws FileNotFoundException {
		// Exception Exception is not compatible with throws clause in Bank.withdraw()
		// When we do vise versa
		System.out.println("withdraw method");
		throw new FileNotFoundException();

	}

	public void checkBalance() {
		System.out.println("Check Balance");
	}

}