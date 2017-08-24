package Algoritmos.Threads;

import Algoritmos.Threads.objects.ProcessorWaitNotify02;

public class Demo11_Wait_Notify_02 {

	public static void main(String[] args) throws InterruptedException {
        final ProcessorWaitNotify02 processor = new ProcessorWaitNotify02();
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
//        t1.join();
//        t2.join();

        // Pause for 30 seconds and force quitting the app (because we're
        // looping infinitely)
        Thread.sleep(30000);
        System.exit(0);
    }

}
