package com.feuji11dec;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfString {
	public List<String> check(List<String> list) {
		list.add("Jyothi");
		list.add("puri");
		list.add("Indu");
		list.add("Supriya");
		list.add("Jyothi");
		return list;
	}

	public static void main(String[] args) {
    List<String> string=new ArrayList<>();
    ListOfString res=new ListOfString();
   List<String>list = res.check(string);
   List<String>result= list.stream().filter((e)->e.equals("Jyothi")).collect(Collectors.toList());
   result.forEach((e)->System.out.println(e));
     
	}

}
