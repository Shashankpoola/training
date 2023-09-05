
public class Demo<Z> {

	private Z data;

	public Demo(Z data) {
	
		this.data = data;
	}

	public Z getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}
	public static void main(String[] args) {
		
		Demo<String> d1= new  Demo<String>("Hola");
	//	d1.setData(100);
		System.out.println(d1.getData());
	    
		Demo<Integer> d2= new Demo<Integer>(99);
	//	d2.setData("modi");
		System.out.println(d2.getData());
		
		Demo<Person> d3= new Demo<Person>(new Person("kim", 11));
		System.out.println(d3.getData());
	}
}
