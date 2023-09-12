package ax1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hi")
public class Hello {

	private String message;

	public Hello() {
		System.out.println("default constructor");
	}

	public Hello(String message) {
		this.message = message;
		System.out.println("parameterised constructor");
	}

	public String getMessage() {
		return message;
	}

	@Value("Aloha Spring!")
	public void setMessage(String message) {
		this.message = message;
		System.out.println("Setter method");
	}

}
