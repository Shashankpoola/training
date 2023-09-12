package ax7;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailMeesage implements Message {

	public EmailMeesage() {

		System.out.println("Email Message Constructor");

	}

	@Override
	public void send(String to, String msg) {

		System.out.println("SMS sent to " + to + "as " + msg);

	}

}
