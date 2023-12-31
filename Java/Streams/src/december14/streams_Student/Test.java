package december14.streams_Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
	
	 static Predicate<Integer> predicate = (Integer e)->(e%2==0)?true:false;
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(14);
		list.add(15);
		list.add(15);
		
	 System.out.println(" odd sum"+list.stream().filter((e)->!(e%2==0)).reduce(0,(e1,e2)->e1+e2));
	 System.out.println("even sum"+list.stream().filter((e)->e%2==0).reduce(0,(e1,e2)->e1+e2));
	 
	 int sumOfOdds = list.stream()
		      .filter(num -> num % 2 != 0)
		      .mapToInt(Integer::intValue)
		      .sum();
	 
//	 List < String > uppercaseStrings = list.stream()
//		      .map(String::toUpperCase).toList();
	 
	 System.out.println("------------------------");
	 
	 list.stream().distinct().forEach((e)->System.out.println(e));
	 
	}
}
