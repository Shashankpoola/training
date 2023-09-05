
public class Person {

	private String name;
	private int age;

	public Person() {
		this("Anonymus", -1);

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("Name: " + name + "\tAge: " + age);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(this.age== p.age &&name.equals(p.name))
				return true;	}
	    return false;
	}
	public static void main(String[] args) {

		// declaration <==> instantiation
		Person p1 = new Person("polo", 21);
		p1.print();
		System.out.println(p1.hashCode());

		System.out.println(p1);
		System.out.println(p1.toString());   //calling toString();
		Person p2= new Person("milli", 20);
		System.out.println(p1.equals(p2));
	}
}
