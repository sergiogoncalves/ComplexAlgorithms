//a number is called a prime number if its only divisible by 1 or itself,

package Algoritmos;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int number = Integer.MAX_VALUE;

		System.out.println("Enter number to check if prime or not ");

		while (number != 0) {
			number = scnr.nextInt();

			System.out.println(isPrime(number) );
		}
	}

	public static boolean isPrime(int number) {
		int sqrt = (int) Math.sqrt(number) + 1;
		
		if(number == 1){
			return false;
		}
		
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) { // number is perfectly divisible - no prime
				return false;
			}
		}

		return true;
	}
	
	/* * Second version of isPrimeNumber method, with improvement like not * checking for division by even number, if its not divisible by 2. */

	
	public static boolean isPrimeNumber(int number) {
		
		if (number == 2 || number == 3) 
		{ 
			return true; 
		} 
		
		if (number % 2 == 0) 
		{ 
			return false; 
		} 
		
		int sqrt = (int) Math.sqrt(number) + 1; 
		
		for (int i = 3; i < sqrt; i += 2) 
		{ 
			if (number % i == 0) 
			{ 
				return false; 
			} 
		} 
		
		return true;
	}
	
	public static String isPrimeOrNot(int num) 
	{ 
		if (num < 0) 
		{ 
			return "not valid"; 
		} 
		
		if (num == 0 || num == 1) 
		{ 
			return "not prime"; 
		} 
		
		if (num == 2 || num == 3) 
		{ 
			return "prime number"; 
		} 
		
		if ((num * num - 1) % 24 == 0) 
		{ 
			return "prime"; 
		} 
		else 
		{ 
			return "not prime"; 
		} 
	}

	

			
}
