package Algoritmos.ordenacao;

public class InsertionSort {

	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}
	
	//Percorre um vetor de elementos da esquerda para a direita e à medida que 
	//avança vai deixando os elementos mais à esquerda ordenados. 
	//O algoritmo de inserção funciona da mesma maneira com que muitas pessoas 
	//ordenam cartas em um jogo de baralho como o pôquer.
	
	//Complexidade Pior Caso: O(n²)
	//Complexidade Caso Médio: O(n²)
	//Complexidade Melhor Caso: O(n)

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
		
		 insertionSort(vetor);
	 
		 for (int i : vetor) {
			System.out.print(i + ",");
		}

	}
	
	public static int[] insertionSort(int[] vetor) {
	        
			long tempoinicial = System.currentTimeMillis();
	        
	        for (int i = 0; i < vetor.length; i++) {
	            
	        	int atual = vetor[i];
	            
	        	int j = i - 1;
	            
	        	while (j >= 0 && vetor[j] >= atual) {
	            
	        		vetor[j + 1] = vetor[j];
	                
	        		j--;
	            }
	            
	        	vetor[j + 1] = atual;;
	        }
	        
	        long tempofinal = System.currentTimeMillis();
	        
	        long tempototal = tempofinal - tempoinicial;
	        
	        System.out.println("Tempo de Processamento de InsertionSort: " + tempototal + "ms");
	        
	        return vetor;
	    }

}
