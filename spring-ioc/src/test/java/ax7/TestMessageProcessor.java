package ax7;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageProcessor {

	@Test
	public void testProcess() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");

		MessageProcessor mp = (MessageProcessor) ctx.getBean("mp");

		mp.process("sms", "1234567890", "Howdy");
		mp.process("email", "1234567890", "Bonjour");
		mp.process("wap", "@sha", "Aloha");

	}

}
