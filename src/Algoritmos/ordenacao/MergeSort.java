package Algoritmos.ordenacao;

public class MergeSort {

	public MergeSort() {
		// TODO Auto-generated constructor stub
	}

	// Sua ideia básica consiste em Dividir (o problema em vários sub-problemas
	// e resolver esses sub-problemas através da recursividade) e
	// Conquistar (após todos os sub-problemas terem sido resolvidos ocorre a
	// conquista que é a união das resoluções dos sub-problemas).
	// Como o algoritmo Merge Sort usa a recursividade, há um alto consumo de
	// memória e tempo de execução, tornando esta técnica não muito eficiente em
	// alguns problemas .

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

		sort(vetor);

		for (int i : vetor) {
			System.out.print(i + ",");
		}

	}

	public static int[] sort(int[] array) {

		if (array.length <= 1) {

			return array;
		}
		int meio = array.length / 2;
		int[] dir = array.length % 2 == 0 ? new int[meio] : new int[meio + 1];
		int[] esq = new int[meio];

		int[] aux = new int[array.length];

		for (int i = 0; i < meio; i++) {
			esq[i] = array[i];
		}

		int auxIndex = 0;
		for (int i = meio; i < array.length; i++) {
			dir[auxIndex] = array[i];
			auxIndex++;
		}

		esq = sort(esq);
		dir = sort(dir);

		aux = mergesort(esq, dir);

		return aux;
	}

	static int[] mergesort(int[] esq, int[] dir) {
		int[] aux = new int[esq.length + dir.length];

		int indexDir = 0, indexEsq = 0, indexAux = 0;

		while (indexEsq < esq.length || indexDir < dir.length) {
			if (indexEsq < esq.length && indexDir < dir.length) {
				if (esq[indexEsq] <= dir[indexDir]) {
					aux[indexAux] = esq[indexEsq];
					indexAux++;
					indexEsq++;
				} else {
					aux[indexAux] = dir[indexDir];
					indexAux++;
					indexDir++;
				}
			} else if (indexEsq < esq.length) {
				aux[indexAux] = esq[indexEsq];
				indexAux++;
				indexEsq++;
			} else if (indexDir < dir.length) {
				aux[indexAux] = dir[indexDir];
				indexAux++;
				indexDir++;
			}
		}
		return aux;
	}

}
