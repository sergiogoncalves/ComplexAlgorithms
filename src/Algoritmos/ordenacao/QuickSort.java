package Algoritmos.ordenacao;

public class QuickSort {

	public QuickSort() {
		// TODO Auto-generated constructor stub
	}

	// O Quicksort adota a estratégia de divisão e conquista.
	// A estratégia consiste em rearranjar as chaves de modo que as chaves
	// “menores” precedam as chaves “maiores”.
	// Em seguida o Quicksort ordena as duas sublistas de chaves menores e
	// maiores recursivamente até que a lista completa se encontre ordenada.

	// Complexidade Pior Caso: O(n²)
	// Complexidade Caso Médio: (nlogn)
	// Complexidade Melhor Caso: (nlogn)

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

		quicksort(vetor,0, 4);

		for (int i : vetor) {
			System.out.print(i + ",");
		}

	}

	public static int[] quicksort(int vet[], int ini, int fim) {

		int meio;

		if (ini < fim) {

			meio = partition(vet, ini, fim);

			quicksort(vet, ini, meio);

			quicksort(vet, meio + 1, fim);

		}

		return vet;

	}

	public static int partition(int vet[], int ini, int fim) {

		int pivo, topo, i;

		pivo = vet[ini];

		topo = ini;

		for (i = ini + 1; i <= fim; i++) {

			if (vet[i] < pivo) {

				vet[topo] = vet[i];

				vet[i] = vet[topo + 1];

				topo++;

			}

		}

		vet[topo] = pivo;

		return topo;

	}
}
