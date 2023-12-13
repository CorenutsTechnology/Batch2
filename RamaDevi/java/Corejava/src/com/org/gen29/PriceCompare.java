package com.org.gen29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PriceCompare implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price==o2.price)
			return 0;
		else if(o1.price>o2.price)
			return 1;
		else
		return -1;
	}
}

