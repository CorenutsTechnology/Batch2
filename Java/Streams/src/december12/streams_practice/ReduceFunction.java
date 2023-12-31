package december12.streams_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceFunction 
{
	public static void main(String[] args) 
	{
		List<String> values = new ArrayList<>();
		values.add("six");
		values.add("two");
		values.add("three");
		values.add("four");
		 values.add("one");
		List<String> collect = values.stream().filter((e) -> e.equals("one")).collect(Collectors.toList());
		System.out.println(collect.size());
		
		Optional<String> optional = values.stream().filter((e) -> e.equals("one")).findAny();
		System.out.println(optional);
		System.out.println(optional.get());
	}
}
