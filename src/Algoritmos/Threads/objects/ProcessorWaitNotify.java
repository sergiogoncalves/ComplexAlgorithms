package Algoritmos.Threads.objects;

import java.util.Scanner;

public class ProcessorWaitNotify {

	public void produce() throws InterruptedException {
		synchronized (this) {
			
			System.out.println("Producer thread running ....");
			
			wait(); // Every object has an wait method because it comes from Object
			// When you put this keyword the thread lose the control of this thread and wait to another thread give a notify command
			
			System.out.println("Resumed.");
			
		}
	}

	public void consume() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		Thread.sleep(2000);
		synchronized (this) {
			System.out.println("Waiting for return key.");
			scanner.nextLine();
			System.out.println("Return key pressed.");
			notify(); //Will release the wait command in another thread; Só pode ser chamado dentro de um bloco synchronized
			Thread.sleep(5000);
			System.out.println("Consumption done.");
		}
	}

}
