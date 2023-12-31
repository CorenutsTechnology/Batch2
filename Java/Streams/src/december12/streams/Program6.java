//6. Add 5 to each element in the integer list. For example, if the input is 1,2,3,4,5, the 
//output should be 6,7,8,9,10?

package december12.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program6 
{
	public static void main(String[] args) 
	{
		List<Integer> integerlist = new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<10;i++)
		{
			integerlist.add(r.nextInt(100));
		}
		integerlist.forEach(e->System.out.print(e+" "));
		System.out.println("===============");
		List<Integer> result =integerlist.stream().map((e)->e+5).toList();
		result.forEach(e->System.out.print(e+" "));
	}
}
