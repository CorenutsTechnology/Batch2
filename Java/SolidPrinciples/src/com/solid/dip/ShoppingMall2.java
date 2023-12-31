package com.solid.dip;

public class ShoppingMall2 {
	private BankCard bankCard;
	public ShoppingMall2(BankCard bankCard)
	{
		this.bankCard=bankCard;
	}
	public void purchase(long amount)
	{
		bankCard.doTransaction(amount);
	}
	public static void main(String[] args) {
//		DebitCard debitCard = new DebitCard();
//		CreditCard creditCard = new CreditCard();
		BankCard bankCard = new DebitCard();
//		BankCard bankCard2 = new CreditCard();
		
		ShoppingMall2 shoppingMall2 = new ShoppingMall2(bankCard);
		shoppingMall2.purchase(100000);
	}
}
