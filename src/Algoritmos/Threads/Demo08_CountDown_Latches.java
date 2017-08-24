package Algoritmos.Threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Algoritmos.Threads.objects.ProcessorCountDown;

public class Demo08_CountDown_Latches {

	public static void main(String[] args) {

		try {
			
			CountDownLatch latch = new CountDownLatch(3); // CountDownLatch is a threadsafe class that you can use to synchronize threads 
			
			ExecutorService executor = Executors.newFixedThreadPool(3);

			for (int i = 0; i < 3; i++) {
				executor.submit(new ProcessorCountDown(latch));
			}

			latch.await();
			
			System.out.println("Completed.");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
