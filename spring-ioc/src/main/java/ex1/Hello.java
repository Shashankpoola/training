package ex1;

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

	public void setMessage(String message) {
		this.message = message;
		System.out.println("Setter method");
	}

}
