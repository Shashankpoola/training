import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {

	public static void print(Object obj) {

		System.out.println(obj);
	}

	public static void main(String[] args) {

		Consumer<String> c1 = (s) -> System.out.println(s);
		c1.accept("Hello");
		
		Consumer<String> c2 = System.out::println;
		c2.accept("Hola");
		
		Consumer<String> c3 = LambdaDemo::print;
		c1.accept("LambdaDemo");
		
		Consumer<Integer> c4 = LambdaDemo::print ;  //:: use?
		c4.accept(123);
		
		Supplier<String> s1 = () -> "Adios";
		System.out.println(s1.get());
		
		Supplier<Integer> s2 = () -> (int)(Math.random() * 100 ); //random method gives a double number b/w 0 to 1
		System.out.println(s2.get());
		
		
		Predicate<Integer>positive = (x) -> x >=0;  // returns boolean
		System.out.println(positive.test(-5));
		System.out.println(positive.test(6));
		
		BiPredicate<String, String> contains = (s,c) -> s.contains(c);  // retuens boolean
		System.out.println(contains.test("Hello", "z"));
		System.out.println(contains.test("Hello", "H"));	
		
		Function<Integer, Integer> square = (x) -> x * x; // <taking type, reutrn type>
		System.out.println(square.apply(5));
		
		BiFunction<Integer, Integer, Integer> sum = (a,b) -> a+b;
		System.out.println(sum.apply(10, 20));
		
	}

}
