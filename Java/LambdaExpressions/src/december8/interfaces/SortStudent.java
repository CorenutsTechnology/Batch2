package december8.interfaces;
import java.util.*;
public class SortStudent 
{
	public static void main(String[] args) 
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student(121,"Pravalika",89.9));
		list.add(new Student(122,"Gowri",86.9));
		list.add(new Student(123,"Rubeena",87.9));
		list.add(new Student(124,"Ambika",83.9));
		list.add(new Student(121,"Pravalika",89.9));
//		list.add(null);
		
		ComparatorImple cmp = new ComparatorImple();
		Collections.sort(list,cmp);
		
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
