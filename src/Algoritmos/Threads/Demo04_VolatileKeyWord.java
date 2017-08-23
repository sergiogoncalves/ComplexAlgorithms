package Algoritmos.Threads;

import java.util.Scanner;

class Processor extends Thread {
	
	private volatile boolean running = true;
	
	@Override
	public void run() {
		try {
			while(running){
				System.out.println("Hello");
				
				Thread.sleep(100);
			}
			
		} catch (Exception e) {
			
		}
	}
	
	public void shutDown(){
		running = false;
	}
}

public class Demo04_VolatileKeyWord {

	public static void main(String[] args) {

		Processor proc1 = new Processor();
		proc1.start();
		
		Processor proc2 = new Processor();
		proc2.start();
		
		System.out.println("Press return to stop...");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		proc1.shutDown();
		proc2.shutDown();

	}

}
