package ax7;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("wap")
@Lazy //it calls the constructor when ever required
public class WhatsAppMessage implements Message {

	public WhatsAppMessage() {
		System.out.println("Whatsapp  MEssage Constructor");
	}

	@Override
	public void send(String to, String msg) {

		System.out.println("SMS sent to " + to + "as " + msg);

	}
}
