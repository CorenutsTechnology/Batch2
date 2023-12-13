package lambda11DEC;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Instant start=Instant.now(); long sum=0; for(int i=1;i<10000;i++) { sum+=i; }
		 * Instant start=Instant.now();
		 */
		List<Integer> list=new ArrayList<>();
		Random r=new Random();
		long esum=0;
		for(int i=1;i<10000000;i++)
		{
		   list.add(r.nextInt());	
		}
		Long t=System.currentTimeMillis();
		Instant start=Instant.now();
		List<Integer> evenList=new ArrayList<>();
		for(Integer i:list)
		{
			if(i%2==0)
				{
				 evenList.add(i);
				 esum=esum+i;
				}
		}
		System.out.println(evenList.size());
        System.out.println(esum);

		Instant end=Instant.now();
		Duration duration=Duration.between(start, end);
		System.out.println(duration.toMillis());
		
		Instant start1=Instant.now();
		System.out.println(list.stream().filter(i->(i%2==0)).collect(Collectors.summingLong(e->e)));
		Instant end1=Instant.now();
		Duration duration1=Duration.between(start1, end1);
		System.out.println(duration1.toMillis());
	}

}
