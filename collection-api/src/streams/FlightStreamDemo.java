package streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStreamDemo {
	public static void main(String[] args) throws Exception {

		List<Flight> flights = null;

		Stream<String> lines = Files.lines(Paths.get("src/flights.txt"));

		flights = lines.map(line -> {
			String[] record = line.split(",");
			return new Flight(Integer.parseInt(record[0]), record[1], record[2], record[3]);
		}).collect(Collectors.toList());

// flights.forEach(System.out::println);

//		flights.stream().filter(f -> f.getCode()==123).forEach(System.out::println); //we cannot use contains strings as records are in object type
//		
//		flights.stream().filter(f -> f.getCarrier().equals("Jet")).forEach(System.out::println); 
//		
//		flights.stream().filter(f -> f.getSource().equals("Pune") && f.getDestination().equals(lines)).forEach(System.out::println); 
//			

		flights.removeIf(f -> f.getCode() == 123);
		flights.forEach(System.out::println);

	}
}
