package december12.streams_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListTest {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("six");
		stringList.add("two");
//		stringList.add("three");
		stringList.add("four");
		
		stringList.forEach((e)->System.out.println(e));
		
		Optional<String> optional= stringList.stream().filter((e)-> e.equals("three")).findAny();
		//to check whether element found or not
		System.out.println((optional.isEmpty())?false:true);
				
		
	}
}
