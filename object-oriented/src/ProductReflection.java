import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
//import java.lang.reflect.*;
import com.ey.shop.Product;

public class ProductReflection {

	public static void main(String[] args) throws Exception {
//		Product p1 = new Product("Parker", 120);
//		p1.print();
//		System.out.println();
//		Class pc = p1.getClass();
//		
		
		Class pc = Class.forName("com.ey.shop.Product");
		
		System.out.println(pc.getName());
		System.out.println(pc.getPackageName());
		System.out.println(pc.getSimpleName());
		
		
		Constructor [] constructors	= pc.getConstructors();  //Constructor is from java.lang.reflection
		for(Constructor c : constructors)
		{
			
			System.out.println(c);
		}
		
		
		System.out.println("-- List of Methods --");
		Method[] methods = pc.getMethods();					//Constructor is from java.lang.reflection
		for (Method m : methods)
			System.out.println(m);
		
		System.out.println("--list of declared methods");
		Method[] decMethods = pc.getDeclaredMethods();
		for(Method m : decMethods) {
			System.out.println(m);
		}
		
		System.out.println("--list of declared fields--");
 		Field[] fields = pc.getDeclaredFields();
 		for(Field f : fields)
 			System.out.println(f);
		
	}

}

