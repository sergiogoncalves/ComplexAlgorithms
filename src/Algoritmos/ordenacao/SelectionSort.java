package Algoritmos.ordenacao;

public class SelectionSort {

	public SelectionSort() {
		// TODO Auto-generated constructor stub
	}

	// Passa sempre o menor valor do vetor para a
	// primeira posição (ou o maior dependendo da ordem requerida),
	// depois o de segundo menor valor para a segunda posição,
	// e assim é feito sucessivamente com os n-1 elementos restantes, até os
	// últimos dois elementos.
	
	/* 
	  
	  Complexidade Pior Caso: O(n²)
      Complexidade Caso Médio: O(n²)
	  Complexidade Melhor Caso: O(n)
	 
	 */
	   
	  

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
		
		 meuSelectionSort(vetor);
	 
		 for (int i : vetor) {
			System.out.print(i + ",");
		}

	}

	public static int[] selectionSort(int[] vetor) {
	
		long tempoinicial = System.currentTimeMillis();
		
		for (int i = 0; i < vetor.length; i++) {
		
			int indiceMinimo = i;
			
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[indiceMinimo]) {
					indiceMinimo = j;
				}
			}

			int tmp = vetor[indiceMinimo]; 
			
			vetor[indiceMinimo] = vetor[i]; // trocando de posição
			
			vetor[i] = tmp;
		}
		
		long tempofinal = System.currentTimeMillis();
		
		long tempototal = tempofinal - tempoinicial;
		
		System.out.println("Tempo de Processamento de SelectionSort: " + tempototal + "ms");
		
		return vetor;
	}

	public static int[] meuSelectionSort(int[] vetor){
		
		int menorIndice = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			menorIndice = i;
			
			for (int j = i + 1; j < vetor.length; j++) {
				
				if (vetor[j] < vetor[menorIndice]) {
					menorIndice = j;
				}
			}
			
			int temp = vetor[i];
			vetor[i] = vetor[menorIndice];
			vetor[menorIndice] = temp;
		}
		
		return vetor;
	}
}
