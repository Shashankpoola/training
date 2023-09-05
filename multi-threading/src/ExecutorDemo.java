import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class GoRunnable implements Runnable {

	private final long countUntil;

	@Override
	public void run() {
 
		long sum = 0;
		for (long i = 0; i < countUntil; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public GoRunnable(long countUntil) {

		this.countUntil = countUntil;
	}

}

// why executors --> reusablity of threads
public class ExecutorDemo {
	private static final int NTHREDS = 10;

	public static void main(String[] args) {

		// ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);

		// ExecutorService executor = Executors.newSingleThreadExecutor();

		ExecutorService executor = Executors.newCachedThreadPool();

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 500; i++) {
			Runnable worker = new GoRunnable(10000000L + i); 
			executor.execute(worker); // execute takes runnable object
										// it is a factory method design pattern
		}
		// this will make executor accept no new threads
		// and finish all existingf threads in the queue
		executor.shutdown();
		// wait until all threads finish
		// executor.awaitTermination(); // waits for termination of all threads

		while (!executor.isTerminated()) {

		}
		System.out.println("Finished all Threads");
		long endTime = System.currentTimeMillis();

		System.out.println(endTime - startTime + " ms");
	}

}
