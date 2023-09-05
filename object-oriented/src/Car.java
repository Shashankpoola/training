
public class Car {

	private String model;
	private String[] features;
	
	public Car(String model, String...features) {// var-args(variable ARGUEMENTS)
		this.model = model;
		this.features = features;
	}
	public void specs() {

		System.out.println("Features of  " +model);
		for(String  f: features)
			System.out.println("> " +f);
		
	}
	public static void main(String[] args) {
	
		Car alto = new Car("Suzuki Alto", "Keyless", "AC", "AGS"); 
		alto.specs();
		
		
		Car astor = new Car("MG ASTOR", "SingleAbs", "non AC", "Sunroof");   
		alto.specs();
		
		
	}
	
}
