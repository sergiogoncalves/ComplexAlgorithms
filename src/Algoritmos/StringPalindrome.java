package Algoritmos;

public class StringPalindrome {

	public static void main(String[] args) {
	
		String number01 = "abac";
		
		String number02 = new StringBuilder(number01).reverse().toString();
		
		System.out.println(number01.equals(number02));
	

	}

}
