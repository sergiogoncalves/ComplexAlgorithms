package Algoritmos.ordenacao;

public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	// A ideia é percorrer o vector diversas vezes, a cada passagem fazendo
	// flutuar
	// para o topo o maior elemento da sequência.
	// Essa movimentação lembra a forma como as
	// bolhas em um tanque de água procuram seu próprio nível, e disso vem o
	// nome do

	// Complexidade Pior Caso: O(n²)
	// Complexidade Caso Médio: O(n²)
	// Complexidade Melhor Caso: O(n)

	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		
		vetor[0] = 10;
		vetor[1] = 4;
		vetor[2] = 7;
		vetor[3] = 13; 
		vetor[4] = 2;
		
		 for (int i : vetor) {
			System.out.print(i + ",");
		}
		 
		 System.out.println("");
		
		 bubbleSort(vetor);
	 
		 for (int i : vetor) {
			System.out.print(i + ",");
		}

	}

	public static int[] bubbleSort(int vetor[]) {
		long tempoinicial = System.currentTimeMillis();
		
		for (int i = vetor.length; i >= 1; i--) {
			
			for (int j = 1; j < i; j++) {
				
				if (vetor[j - 1] > vetor[j]) {
				
					int aux = vetor[j];
				
					vetor[j] = vetor[j - 1];
					
					vetor[j - 1] = aux;
				}
			}
		}
		long tempofinal = System.currentTimeMillis();
		long tempototal = tempofinal - tempoinicial;
		System.out.println("Tempo de Processamento de BubbleSort: " + tempototal + "ms");
		return vetor;
	}

}
