//7. Find the sum of all elements in the list. For example, if the input is 1,2,3,4,5, the output should be 15?
package december12.streams;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Program7 
{
	
	public static void main(String[] args) {
		List<Integer> integerlist = new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<100;i++)
		{
			integerlist.add(r.nextInt(100));
		}

		int sum=0;
		sum =integerlist.stream().reduce(0,(a,b)->a+b);
		System.out.println("sum is: "+sum);
		
		int sum2 = integerlist.stream().reduce(0,Integer::sum);
		System.out.println(sum2);
//		Integer sum = integers.reduce(0, (a, b) -> a+b);
//		Integer sum = integers.reduce(0, Integer::sum);

		System.out.println(integerlist.stream().reduce(0,(a,b)->a+b));
		System.out.println(integerlist.stream().collect(Collectors.summarizingInt(e->e)).getSum());
	}
}
