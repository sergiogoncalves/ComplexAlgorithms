package Algoritmos.Threads;

/*
 
	 Synchronized - Every thread when acces some functionality has a in transit lock, 
	 when you use synhronized key word you garantee that just one thread each time is 
	 using this function. So another thread will need to wait the thread that is using 
	 this functionality finish
 
 */

public class Demo05_Synchronized {
	
	private int count = 0;
	
	public synchronized void increment(){
		count++;
	}

	public static void main(String[] args) {
		
		Demo05_Synchronized app = new Demo05_Synchronized();
		
		app.doWork();
	}
	
	public void doWork(){
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		}

		
		System.out.println("Count is: " + count);
	}

}
