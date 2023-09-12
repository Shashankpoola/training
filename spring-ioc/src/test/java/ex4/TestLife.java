package ex4;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife {
	

	@Test
	public void testCycle() {
		ConfigurableApplicationContext appctx = new ClassPathXmlApplicationContext("ex4ctx.xml");
		appctx.getBean(LifeCycle.class);

		appctx.close();
	}

}
