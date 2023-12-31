package december14.streams_Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.*;
import java.util.TreeMap;

public class Collection_Test {
	public static void main(String[] arg) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Core", "M"));
		persons.add(new Person(2, "Nuts", "M"));
		persons.add(new Person(3, "Sbr", "F"));
		persons.add(new Person(4, "Rose", "M"));
		persons.add(new Person(5, "Jazz", "F"));
		Map<String, List<Person>> genderMap = new TreeMap<>();
		List<Person> tempPersons = new ArrayList<>();
		for (Person person : persons) {
			if (genderMap.containsKey(person.getGender())) {
				tempPersons = genderMap.get(person.getGender());
			}
			tempPersons.add(person);
			genderMap.put(person.getGender(), tempPersons);
		}
		for (Map.Entry<String, List<Person>> element : genderMap.entrySet()) {
			System.out.println(element.getKey() + " : " + element.getValue().size());
		}
		
//		persons.stream().sorted((o1,o2)->{
//			return o1.getName().compareTo(o2.getName());
//		}).forEach(e->System.out.println(e));
//			
		
		Map<Integer ,Integer> map = new HashMap<>();
		map.put(1,2);
		map.put(2,3);
		map.put(3,3);
		map.put(4,5);
		
		System.out.println("second way");
		Set<Entry<Integer,Integer>> entrySet = map.entrySet();
		
		Iterator<Entry<Integer,Integer>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext())
		{
			
			System.out.println(iterator2.next());
		}
		
	}
}