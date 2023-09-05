import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {

	public static void main(String[] args) {
		
		Comparator<Person> compAge = (p1,p2) -> p1.getAge() - (p2.getAge());
		
		Comparator<Person> compName = (p1,p2) -> p1.getName().compareTo(p2.getName());
		
		
		TreeSet<Person> people = new TreeSet<Person>();

		people.add(new Person("polo", 21));

		people.add(new Person("jack", 25));

		people.add(new Person("lili", 23));

		for (Person p : people)
			System.out.println(p);
	}

}
