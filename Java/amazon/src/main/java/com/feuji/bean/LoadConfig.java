package com.feuji.bean;

import org.springframework.stereotype.Component;

@Component
public class LoadConfig 
{
	public Item getItem()
	{
		Item item = new Item();
		item.setId(101);
		item.setName("shirt");
		return item;
	}
	
	public Cart getCart()
	{
		Cart cart = new Cart();
		cart.setId(201);
		cart.setName("Cart-1");
		return cart;
	}
	
}
