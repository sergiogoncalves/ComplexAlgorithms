package Algoritmos.Threads.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

	private Random random = new Random();

	private Object lock1 = new Object();
	private Object lock2 = new Object();

	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();

	public void stageOne() {

		synchronized (lock1) {

			try {

				Thread.sleep(1);

				list1.add(random.nextInt(100));

			} catch (Exception e) {

			}
		}

	}

	public void stageTwo() {
		synchronized (lock2) {
			try {

				Thread.sleep(1);

				list2.add(random.nextInt(100));

			} catch (Exception e) {

			}
		}

	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public void main() {

		System.out.println("Starting...");

		long start = System.currentTimeMillis();

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				process();
			}

		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				process();
			}

		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {

		}

		long end = System.currentTimeMillis();

		System.out.println("Time take: " + (end - start));
		System.out.println("List 1: " + list1.size() + "; List2: " + list2.size());

	}

}
