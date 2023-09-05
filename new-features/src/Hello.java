
@FunctionalInterface
public interface Hello {

	String sayHello();
	
	default String sayBye() {  // default is because you can't define a method inside abstract class
		return "Good Bye!";
		
	}
	static void greeting() {		// we can have a static method with fully defined
		System.out.println("Good day");
	}
	
}
