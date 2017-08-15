package Algoritmos;

public class ConverterNumerosParaBinariosAcharGap {

	public ConverterNumerosParaBinariosAcharGap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int N = 561892;
		
		String string = Integer.toBinaryString(N);
		
		int maximo = 0;
		int atual = 0;
		
		for (int i = 0; i < string.length(); i++) {
			
			if(string.charAt(i) == '1')
			{
				if(atual > maximo){
					maximo = atual;
				}
				atual = 0;
				continue;
			}
			atual++;
		}
		
		System.out.println(maximo);
		System.out.println(string);
	}

}
