package december14.streams_Student;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StreamsOnMap {
	public void method()
	{
		Map<Employee2,String> map = new TreeMap<>();
		map.put(new Employee2(123,"sree","Hyd"),"SE");
		map.put(new Employee2(124,"raju","Bnglr"),"SD");
		map.put(new Employee2(125,"jony","Odisha"),"Tester");
		map.put(new Employee2(126,"ram","TL")," ssSE");
		map.put(new Employee2(126,"ram","AP"),"tSE");//doubt ,it is giving 4 values if we sort using
					// name ,but 5 values if we sort using location
		
		
		map.entrySet().stream().map((e)->{
			return e.getKey();
		}).sorted((o1,o2)->{
			return o1.getLocation().compareTo(o2.getLocation());
		}).forEach((e)->System.out.println(e));
		
		map.entrySet().stream().sorted((e1, e2)->{
			return e1.getKey().getLocation().compareTo(e2.getKey().getLocation());
		}).forEach(e->System.out.println(e.getKey()+" --  "+e.getValue()));
		
		map.entrySet().stream().filter((e)->e.getValue().equals("SD")).filter((e)->e.getKey().getLocation().equals("Bnglr")).
		forEach((e)->System.out.println(e.getKey().getName()));
		System.out.println("-----------------------");
		map.entrySet().stream().map((e)->e.getKey().getName()).forEach((e)->System.out.println(e.toUpperCase()));
	
//		values.stream().map((e)->e.toLowerCase()).forEach((e)->System.out.println(e+" hey"));
	
	}
	public static void main(String[] args) {
		new StreamsOnMap().method();
	}
}
