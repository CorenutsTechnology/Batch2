package com.feuji.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feuji.bean.Item;
import com.feuji.repository.ItemRepository;

@Service(value = "myService")
public class ItemServiceImpl implements ItemService
{

	public ItemServiceImpl()
	{
		
	}
	
//	@Autowired
//	private ItemRepository itemRepository;
	@Override
	public Item save(Item item) 
	{
		return null;
	}

	@Override
	public Item get(long id) {
		return null;
	}

	@Override
	public Item update(Item item) {
		return null;
	}

	@Override
	public void delete(long id) {
		
	}

	@Override
	public List<Item> items() {
		return null;
	}

}
