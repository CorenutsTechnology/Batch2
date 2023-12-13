package com.org.collection1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapClass {
	private void displayMap(Map<String, String> map) {
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key);
		}
	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("one", "Hyderabad");
		map.put("two", "chennai");
		map.put("three", "delhi");
		map.put("four", "kolkatta");
		map.put("five", "kolkatta");
		map.put(null, null);
		// map.put(null, null);

		System.out.println(map.containsKey("two"));
		System.out.println(map.containsValue("delhi"));

		Set<Entry<String, String>> entryset = map.entrySet();
		Iterator<Entry<String, String>> iterator = entryset.iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		MapClass maps = new MapClass();
		maps.displayMap(map);

	}
}
