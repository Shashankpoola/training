public class SyncDemo implements Runnable {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		print(name);
	}

	private Object dummy = new Object();

	private void print(String name) { // if private sync void.... = syncronised method: locks current obj by default
		System.out.println("Thread Entered the method " + name);
		try {

//			synchronized (this) {  // Here, this locks whole object
//				System.out.print("[");
//				Thread.sleep(1000);
//				System.out.print(name);
//				Thread.sleep(1000);
//				System.out.println("]");}

			synchronized (dummy) { // using dummy object only where sync is needed
				System.out.print("[");
				Thread.sleep(1000);
				System.out.print(name);
				Thread.sleep(1000);
				System.out.println("]");
				System.out.println("Thread completed method" + name);
			}

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		SyncDemo sd = new SyncDemo();
		Thread t1 = new Thread(sd, "Alfa");
		Thread t2 = new Thread(sd, "Beta");
		Thread t3 = new Thread(sd, "Gama");
		t1.start();
		t2.start();
		t3.start();
	}
}