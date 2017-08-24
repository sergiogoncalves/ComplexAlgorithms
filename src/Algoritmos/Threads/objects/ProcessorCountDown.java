package Algoritmos.Threads.objects;

import java.util.concurrent.CountDownLatch;


public class ProcessorCountDown implements Runnable {
	private CountDownLatch latch;
	
    public ProcessorCountDown(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			System.out.println("Started.");
			Thread.sleep(3000);
			
		} catch (Exception e) {

		}
		
		latch.countDown();
	}
}
