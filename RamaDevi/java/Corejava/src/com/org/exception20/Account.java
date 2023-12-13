package com.org.exception20;

public interface Account 
 {
void withdraw(double amount) throws InsufficientBalance;
void deposit(double amount)throws MoreBalance;
}
