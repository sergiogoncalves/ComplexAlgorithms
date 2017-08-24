package Algoritmos.Threads;

import Algoritmos.Threads.objects.ProcessorWaitNotify;

public class Demo10_Wait_Notify {

	public static void main(String[] args)  throws InterruptedException  {
		
		final ProcessorWaitNotify processor = new ProcessorWaitNotify();
		
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.produce();
                } catch (InterruptedException ignored) {}
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.consume();
                } catch (InterruptedException ignored) {}
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

	}

}
