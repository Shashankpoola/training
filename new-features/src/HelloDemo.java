
public class HelloDemo {

	
	public static void main(String[] args) {
		Hello h1 = () -> "Hello World";
		System.out.println(h1.sayHello());
		
		Hello h2 = () -> 
		{String msg = "Hola";
		 return msg;  // return is mandatory if it is a multiple lines
		};
		System.out.println(h2.sayHello());
		System.out.println(h2.sayBye());
		
		Hello.greeting();  // we can call static methods using their class name
		
		
		
	}
}
