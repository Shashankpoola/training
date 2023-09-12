package ax6;

import org.springframework.stereotype.Component;

@Component("temp")
public class TemperatureConverter {

	public int ctof(int c) {

		int f = (c * 9 / 5)+32;
		System.out.println(c + "celceius to fahrenhit is " + f);
		return f;

	}
	
	public int ftoc(int f) {
		int c = (f-32) * 5/9;
		System.out.println(f+ "fahrenhit to celcieus is" + c);
		return c;
	}
	
}
