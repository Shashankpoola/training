
class OuterEventImpl implements Event {

	@Override
	public void doSomething() {
		System.out.println("Outer class Implemented");
	}

}

public class EventDemo implements Event {

	@Override
	public void doSomething() {

		System.out.println("Simple Event Implementation");

	}

	private class InnerEventImpl implements Event {

		@Override
		public void doSomething() {

			System.out.println("Inner class Implemented");
		}

	}

	public static class StaticEventImpl implements Event {

		@Override
		public void doSomething() {
			System.out.println("Static event implemented");
		}

	}

	public void oneMoreEvent() {

		class NestedEventImpl implements Event {

			@Override
			public void doSomething() {
				System.out.println("Nested Event pmlemented");
			}

		}
		;
		new NestedEventImpl().doSomething();
	}

	public void oneLastEvent() {
		 new Event() {   //one time use class(no class name)(no impl)

			@Override
			public void doSomething() {
				System.out.println("Anonymous Event Implemented");
			}

		}.doSomething();
	}
	
	public void pakkaLastEvent(){
		Event e= () -> System.out.println("Lambda event implementation");
		e.doSomething();
	}
	

	public static void main(String[] args) {
		EventDemo ed = new EventDemo();
		ed.doSomething();

		OuterEventImpl oe = new OuterEventImpl();
		oe.doSomething();

		InnerEventImpl ie = ed.new InnerEventImpl(); // need an outer class object for inner object creation
		ie.doSomething();

		EventDemo.StaticEventImpl se = new EventDemo.StaticEventImpl();
		se.doSomething();

		ed.oneMoreEvent();

		ed.oneLastEvent();
		
		ed.pakkaLastEvent();
	}

}
