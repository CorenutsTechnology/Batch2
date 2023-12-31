package com.feuji.service;

import java.util.List;

import com.feuji.bean.Item;

public interface ItemService 
{
	public Item save(Item item);

	public Item get(long id);

	public Item update(Item item);

	public void delete(long id);

	public List<Item> items();
}
