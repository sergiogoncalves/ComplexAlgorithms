package Algoritmos;

public class EncontrarSeculo {

	public static void main(String[] args) {
		int year = 1701;
		int seculo;

		if (year % 100 == 0) {
			seculo = year / 100;
		} else {
			seculo = (year - (year % 100)) / 100 + 1;
		}
		
		
		System.out.println(seculo);
	}

}
