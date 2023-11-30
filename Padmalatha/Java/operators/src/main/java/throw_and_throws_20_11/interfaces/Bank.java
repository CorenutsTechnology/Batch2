package throw_and_throws_20_11.interfaces;

import throw_and_throws_20_11.InSuficientBalance;

public interface Bank {

	void deposit(double amount);

	void withdraw(double amount) throws InSuficientBalance;

}
