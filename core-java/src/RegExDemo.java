
public class RegExDemo {

	public static void main(String[] args) {
		
		String name="Shashank";
		String mobile="8008729618";
		String email="shashankp@gmail.com";
		
		String nameRegex="[A-Z]{1}[a-z]{3,}";
		String mobileRegex="[6-9]{1}[0-9]{9}";
		String emailRegex="";
		
		System.out.println(name.matches(nameRegex)?"valid":"invalid");
        System.out.println(mobile.matches(mobileRegex)?"valid":"invalid");
	}

}
