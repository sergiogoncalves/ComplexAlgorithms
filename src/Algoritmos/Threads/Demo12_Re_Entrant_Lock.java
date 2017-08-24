package Algoritmos.Threads;

import Algoritmos.Threads.objects.RunnerDemo12;

public class Demo12_Re_Entrant_Lock {

	public static void main(String[] args) throws Exception {
		final RunnerDemo12 runner = new RunnerDemo12();
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
