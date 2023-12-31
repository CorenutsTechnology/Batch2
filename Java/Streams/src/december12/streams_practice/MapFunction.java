package december12.streams_practice;

import java.util.ArrayList;
import java.util.List;

public class MapFunction 
{
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("six");
		stringList.add("two");
		stringList.add("three");
		stringList.add("four");
		stringList.add("one");
		
		List<String> changedList = stringList.stream().map((e)->{
			if(e.equals("one"))
				return e;
			return e.toUpperCase();
		}).toList();
		
		changedList.forEach((e)->System.out.println(e));
		
		
	}
}
