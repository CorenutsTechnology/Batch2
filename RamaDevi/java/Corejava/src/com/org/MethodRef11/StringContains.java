package com.org.MethodRef11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StringContains {

	public static void main(String[] args) {
	//	String s="corenuts technology corenuts core";
		List<String> stringlist=new ArrayList<>();
		stringlist.add("corenuts");
		stringlist.add("corenut");
		stringlist.add("technology");
		stringlist.add("core");
		Optional<String> opt=stringlist.stream().filter((e)->e.equals("coren")).findAny();
		System.out.println(opt);
		
	}

}
