package Algoritmos.Threads;

public class Demo03_FormaAlternativaAFormaRunnable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Hello " + i);

					try {
						Thread.sleep(100);

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});

		t1.start();
	}
}
