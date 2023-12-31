package com.ajio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WhishList 
{
	private List<Clothes> clothes;

	public WhishList(List<Clothes> clothes) {
		super();
		this.clothes = clothes;
	}

	public List<Clothes> getClothes() {
		return clothes;
	}

	@Autowired
	public void setClothes(List<Clothes> clothes) {
		this.clothes = clothes;
	}

	@Override
	public String toString() {
		return "WhishList [clothes=" + clothes + "]";
	}
	
}
