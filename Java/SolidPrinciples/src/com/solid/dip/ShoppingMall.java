package com.solid.dip;

public class ShoppingMall 
{
	private CreditCard creditCard;
	public ShoppingMall(CreditCard creditCard)
	{
		this.creditCard=creditCard;
	}
	public void purchase(long amount)
	{
		creditCard.doTransaction(amount);
	}
	public static void main(String[] args) {
		DebitCard debitCard = new DebitCard();
		CreditCard creditCard = new CreditCard();
		
		ShoppingMall shoppingMall = new ShoppingMall(creditCard);
		shoppingMall.purchase(100000);
	}
}
