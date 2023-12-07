package com.crnuts.classes;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class CountWords_Q1 {

	public void countWords(Map<String, Integer> map, String[] words) {
		int countWord = 0;
		for (String word : words) {
			if (map.containsKey(word)) {
				countWord = map.get(word);
				countWord++;
				map.put(word, countWord);
			} else {
				map.put(word, 1);
			}
		}
		for (String word : map.keySet())
			System.out.println(word + " - " + map.get(word));
	}

}
