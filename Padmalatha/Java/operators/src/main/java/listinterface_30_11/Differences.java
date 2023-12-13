package listinterface_30_11;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.*;
public class Differences {

	public void arrayList() {
		ArrayList<Integer> al=new ArrayList();
		Instant start=Instant.now();
		for(int i=1;i<1000000;i++)
		{
			al.add(i);
		}
		Instant end=Instant.now();
		Duration time=Duration.between(start, end);
		System.out.println("ArrayList took:"+time.toMillis()+"ms");
		
	}
	public void linkedList()
	{
		LinkedList<Integer> al=new LinkedList();
		Instant start=Instant.now();
		for(int i=1;i<1000000;i++)
		{
			al.add(i);
		}
		Instant end=Instant.now();
		Duration time=Duration.between(start, end);
		System.out.println("LinkedList took:"+time.toMillis()+"ms");
	}
	
	public void vector()
	{
		Vector<Integer> v=new Vector();
		Instant start=Instant.now();
		for(int i=1;i<1000000;i++)
		{
			v.add(i);
		}
		Instant end=Instant.now();
		Duration time=Duration.between(start, end);
		System.out.println("VectorList took:"+time.toMillis()+"msqw3222");
	}
	
	public static void main(String[] args) {
		Differences differences=new Differences();
		differences.arrayList();
		differences.linkedList();
		differences.vector();
	}
	
}
