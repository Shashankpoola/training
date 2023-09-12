package ex1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
	
	
	
	
	@Test
	public void testMessage() {
		
		ApplicationContext appctx = new ClassPathXmlApplicationContext("ex1ctx.xml");
		
//		Hello h = (Hello) appctx.getBean("hi"); //type casting
		
//		Hello h = (Hello) appctx.getBean("hi", Hello.class); //using id and value which specified in xml
		
		Hello h = (Hello) appctx.getBean(Hello.class);
		
		System.out.println("Message: " + h.getMessage());
	}
}
