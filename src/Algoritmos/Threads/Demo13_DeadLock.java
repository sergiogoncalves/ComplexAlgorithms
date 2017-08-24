package Algoritmos.Threads;

import Algoritmos.Threads.objects.Runner_Demo13_DeadLock;

public class Demo13_DeadLock {

	public static void main(String[] args) throws Exception {
		final Runner_Demo13_DeadLock runner = new Runner_Demo13_DeadLock();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					runner.firstThread();
				} catch (InterruptedException ignored) {
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					runner.secondThread();
				} catch (InterruptedException ignored) {
				}
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		runner.finished();
	}
}
