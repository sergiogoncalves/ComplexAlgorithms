/*
 If you have looked above code carefully then you may have figured out that real reason 
	for deadlock is not multiple threads but the way they are requesting lock , 
	if you provide an ordered access then problem will be resolved , 
	here is my fixed version, which avoids deadlock by avoiding circular wait with no preemption.
*/

// TEM QUE TER O COMANDO SYNCHRONIZED
package Algoritmos;

public class AvoidDeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void method1() {
        synchronized (String.class) {
            System.out.println("Aquired lock on String.class object");

            synchronized (Integer.class) {
                System.out.println("Aquired lock on Integer.class object");
            }
        }
    }
	
	public void method2() {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
            }
        }
    }
	
	//Avoiding dead lock - Chamar os recursos na mesma hora
	
	public void method1s() {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
            }
        }
    }

    public void method2s() {
        synchronized (Integer.class) {
            System.out.println("Aquired lock on Integer.class object");

            synchronized (String.class) {
                System.out.println("Aquired lock on String.class object");
            }
        }
    }

}
