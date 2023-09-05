import static java.lang.System.*;
import static java.lang.Math.*;

public class ImportsDemo {

	public static void main(String[] args) {
		out.println("Hello"); // no need to write again if we have static imports
		out.println(PI);
		out.println(random() * 100);
		out.println(currentTimeMillis());

	}

}
