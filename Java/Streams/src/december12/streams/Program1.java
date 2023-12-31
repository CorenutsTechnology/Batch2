//1. Create a list of names and find the number of records using streams?

package december12.streams;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Program1 
{
	
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		
		list.add("pravalika");
		list.add("gowri");
		list.add("mamatha");
		list.add("gowthami");
		list.add("ambika");
		list.add("sravani");
		
		for(String str:list)
		{
			System.out.println(str);
		}
		
		//using streams
		long count = list.stream().count();
		System.out.println("count of records is: "+count);

		
		//using collections
		System.out.println(list.size());
		
		
		
		
		
		
		
		
		
		
		
//		Stream<String> s = list.stream();
		//printing values		
//		s.forEach((e)->System.out.println(e));
		
		//find name
//		List<String> list2 =list.stream().filter((e)->{
//			if(e.contains("pravalika"))
//				return "true" != null;
//			else
//				return "false" != null;
//		}).collect(Collectors.toList());
//		System.out.println("---------");
//		System.out.println(list2);
//		list2.forEach((e)->System.out.println(e));
		
	}
}
