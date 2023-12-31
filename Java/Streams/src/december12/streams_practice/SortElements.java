package december12.streams_practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortElements 
{
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("six");
		stringList.add("two");
		stringList.add("three");
		stringList.add("four");
		
		System.out.println("ascending order........");
		stringList.stream().sorted().forEach((e)->System.out.print(e+" "));
		
		System.out.println("descending order.........");
		stringList.stream().sorted(Comparator.reverseOrder()).forEach((e)->System.out.println(e));
	}
}
