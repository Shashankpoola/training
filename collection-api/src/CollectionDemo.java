import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {

		
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Microsoft");
		lst.add("Google");
		lst.addFirst("Apple");

		lst.addLast("Apache");
		lst.add(2,"Oracle");
		
		
		System.out.println("Iterating using for loop");
		
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
		System.out.println("Iterating using Iterator");
		
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Iterating using dfor each ");
		for(String e : lst)
			System.out.println(e);
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("IBM");
		ar.add("Apple");
		ar.add("JBoss");
			
		ar.addAll(lst);
		System.out.println("Iterating over merged collection");
		for(String e : ar)
			System.out.println(e);
		
		HashSet<String> set = new HashSet<String>();
		System.out.println("Iterating over set collection");
		for(String e : set)
			System.out.println(e);
		TreeSet<String> tree = new TreeSet<String>();
		System.out.println("Iterating over sorted collection");
		for(String e : tree)
			System.out.println(e);
		System.out.println("Traversing over aorted collection using advanced For - each");
		tree.forEach(System.out::println);
		
	}

}
