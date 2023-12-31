package com.feuji.bean;

import java.util.List;

import org.springframework.stereotype.Component;

//@Component
public class Cart 
{
	private long id;
	private String name;
	private List<Item> items;
	
	public Cart() {
		super();
	}

	public Cart(long id, String name, List<Item> items) {
		super();
		this.id = id;
		this.name = name;
		this.items = items;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + ", items=" + items + "]";
	}
	
	
}
