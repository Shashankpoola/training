package ax5;

import java.beans.JavaBean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeConfig {

	public ExchangeService get() {

		System.out.println("Exchange Service Object requested");
		return new ExchangeService();

	}

}
