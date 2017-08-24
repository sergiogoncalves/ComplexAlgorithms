package Algoritmos.Threads.objects;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class RunnerDemo12 {

	public RunnerDemo12() {
		// TODO Auto-generated constructor stub
	}

	private int count = 0;
	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition(); // Get the condition of lock and use it in class

	private void increment() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}

	public void firstThread() throws InterruptedException {
		lock.lock();
		System.out.println("Waiting ....");
		cond.await(); //Point 01 - para a execução
		System.out.println("Woken up!");
		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void secondThread() throws InterruptedException {
		System.out.println("Primeiro Waiting ...."); //Ao parar lá em cima vem pra cá e para a execução depois que eu entrei com o codigo da linha volta para o woken lá em cima.
		Thread.sleep(1000);
		lock.lock();
		System.out.println("Press the return key!");
		new Scanner(System.in).nextLine();
		System.out.println("Got return key!");
		cond.signal();
		try {
			increment();
		} finally {
			// should be written to unlock Thread whenever signal() is called
			lock.unlock();
		}
	}

	public void finished() {
		System.out.println("Count is: " + count);
	}

}
