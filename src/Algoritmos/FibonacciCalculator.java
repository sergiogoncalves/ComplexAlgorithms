// É uma sequência de números inteiros, começando normalmente por 0 e 1, na qual, cada termo subsequente corresponde a soma dos dois anteriores. 
package Algoritmos;

import java.util.Scanner;

public class FibonacciCalculator {

	public static void main(String[] args) {

		// input to print Fibonacci series upto how many numbers
		System.out.println("Enter number upto which Fibonacci series to print: ");

		int number = new Scanner(System.in).nextInt();

		System.out.println("Fibonacci series upto " + number + " numbers : ");

		// printing Fibonacci series upto number

		for (int i = 1; i <= number; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}

	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}

		return fibonacci(number - 1) + fibonacci(number - 2); // tail recursion
	}

	public static int fibonacci2(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}

		int fibo1 = 1, fibo2 = 1, fibonacci = 1;

		for (int i = 3; i <= number; i++) {

			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;

		}

		return fibonacci;
	}

	/*public static int improvedFibo(int number) {
		Integer fibonacci = cache.get(number);

		if (fibonacci != null) {
			return fibonacci;
		}

		fibonacci = fibonacci2(number);

		cache.put(number, fibonacci);

		return fibonacci;
	}*/

}
