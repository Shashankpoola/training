import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Employee e = new Employee(101, "Polo", 3000.0);
		System.out.println(e);

		ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream("emp.dat"));// FileNotfound and IO
																								// Exception
		e.writeExternal(ostream);
		ostream.close();

		Employee e2 = new Employee();
		ObjectInputStream istream = new ObjectInputStream(new FileInputStream("emp.dat")); // classNotfound exception
		e2.readExternal(istream);
		istream.close();

		System.out.println(e2);

	}

}
