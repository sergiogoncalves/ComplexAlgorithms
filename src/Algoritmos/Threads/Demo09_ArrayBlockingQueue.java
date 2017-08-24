package Algoritmos.Threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo09_ArrayBlockingQueue {

	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				producer();
			}
		});
		
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				consumer();
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
		}
		
		
		
	}

	private static void producer() {
		Random random = new Random();

		try {
		
			while (true) {
				
				queue.put(random.nextInt(100));
				
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static void consumer(){
		Random random = new Random();
		
		try {
			
			while (true) {
				
				Thread.sleep(100);
				if (random.nextInt(10) == 0) {
					Integer value = queue.take();
					
					System.out.println("Taken value: " + value + "; Queue size is: " + queue.size());
				}
				
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
