package ax5;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {

	@Test
	public void testExchange() {

		ApplicationContext appctx = new AnnotationConfigApplicationContext(ExchangeConfig.class);
		ExchangeService service = (ExchangeService) appctx.getBean("xe");

		service.conversion();

	}

}
