package Algoritmos.Threads;



class Runner extends Thread { // Uma das maneiras de utilizar threads é extender a classe thread


	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
			
			try {
				Thread.sleep(100);
				
			} catch (InterruptedException e) {

			}
		}
	}
	
}


public class Demo01_IniciarThread_Forma01 {

	public static void main(String[] args) {
	
			Runner runner1 = new Runner();
			runner1.start(); //Se chamar pelo método run ele roda o código, se chamar pelo start ele inicia uma nova thread
			
			Runner runner2 = new Runner();
			runner2.start();
			
	}

}
