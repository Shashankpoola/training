package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapStreamDemo {

	public static void main(String[] args) {

		Map<String, String> people = new HashMap<>();
		people.put("Polo", "Pune");
		people.put("Milli", "Mumbai");
		people.put("Deolo", "Delhi");

		people.keySet().stream().forEach(System.out::println);

		people.values().stream().forEach(System.out::println);

		List<String> cities = people.values().stream().map(c -> c.toUpperCase()).sorted().collect(Collectors.toList());

		List<String> cities1 = people.keySet().stream().map(c -> c.toUpperCase()).sorted().collect(Collectors.toList());

		// cities.forEach(System.out::println);

		cities1.forEach(System.out::println);

	}

}
