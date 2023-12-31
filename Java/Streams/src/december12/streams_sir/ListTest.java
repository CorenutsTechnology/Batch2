package december12.streams_sir;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListTest {

	public static void main(String[] args) {

		List<String> values = new ArrayList<>();
		values.add("six");
		values.add("two");
		values.add("three");
		values.add("four");
		 values.add("one");

//		 values.forEach((e) -> System.out.println(e));

		Optional<String> valueOptional = values.stream().filter((e) -> !e.equals("three")).findAny();
		String value = valueOptional.orElseThrow(() -> new IllegalArgumentException("No Value"));
		 System.out.println(value);

		System.out.println("==========Sorting Start===========");
		values.stream().sorted(Comparator.reverseOrder()).forEach((e) -> {
			String upperCase = e.toUpperCase();
			System.out.println(upperCase);
		});
		System.out.println("==========Sorting End===========");

		System.out.println("=====================");
		List<String> changedList = values.stream().map((e) -> {
			if (e.equals("one")) {
				return e;
			}
			return e.toUpperCase();
		}).collect(Collectors.toList());
		changedList.stream().forEach(e -> System.out.println(e));

		// values.stream().forEach((e) -> System.out.println(e));

		List<String> collect = values.stream().filter((e) -> e.equals("one")).collect(Collectors.toList());
		System.out.println(collect.size());
		System.out.println("=====================");

		Map<String, String> map = values.stream().collect(Collectors.toMap(e -> e.toUpperCase(), e -> e));
		map.entrySet().stream().forEach(e -> System.out.println(e));

	}

}

