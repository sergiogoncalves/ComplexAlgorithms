package Algoritmos.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import Algoritmos.Threads.objects.Processor;


public class Demo07_Threads_Pools_Executors {


	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2); // Threead pool é o numero de factories pra rodar, em outras palavras é o número de threads que vc pode usar

		for (int i = 0; i < 5; i++) {
			
			executor.submit(new Processor(i));
			
		}
		
		executor.shutdown();
		
		System.out.println("All taskes submitted.");
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
		}
		
		System.out.println("All taskes completed.");
	}

}
