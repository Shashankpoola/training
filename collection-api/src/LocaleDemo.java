import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

	public static void main(String[] args) {

	//ResourceBundle bundle = ResourceBundle.getBundle("msgs", Locale.FRENCH); // file name important bigilu
		
		Locale desi = new Locale("hi"); // Locale is in java.util package
		
		ResourceBundle bundle = ResourceBundle.getBundle("msgs", desi);
	
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
	}

}
