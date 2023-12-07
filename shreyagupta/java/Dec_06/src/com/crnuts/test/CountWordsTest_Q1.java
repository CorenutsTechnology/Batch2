package com.crnuts.test;

import java.util.HashMap;
import java.util.Map;

import com.crnuts.classes.CountWords_Q1;

public class CountWordsTest_Q1 {
	
	public static void main(String[] args) {
		String text = "Core nuts technologies located in Bangalore Core nuts "
				+ "technologies located in hyderabad Core nuts technologies in"
				+ " Hyderabad Core nuts technologies in Bangalore";
		
		String[] words= text.split(" ");
		
		Map<String,Integer> map=new HashMap<>();
		
		CountWords_Q1 countWords =new CountWords_Q1();
		
		countWords.countWords(map, words);

}
}
