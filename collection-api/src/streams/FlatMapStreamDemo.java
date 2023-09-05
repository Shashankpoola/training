package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapStreamDemo {

	public static void main(String[] args) {

		Map<String, List<String>> contacts = new HashMap<>();
		contacts.put("Frudo", Arrays.asList("1212-3434", "5656-7878"));
		contacts.put("Sean", Arrays.asList("2212-3534", "5666-7888", "8989-8989"));
		contacts.put("Ben", Arrays.asList("2112-3344", "5633-1188", "8090-2321"));

		contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);

		System.out.println("-- Lucky Numbers --");
		List<String> lucky = contacts.values().stream().flatMap(Collection::stream).filter(c -> c.contains("8"))
				.collect(Collectors.toList());

		lucky.forEach(System.out::println);

	}

}
