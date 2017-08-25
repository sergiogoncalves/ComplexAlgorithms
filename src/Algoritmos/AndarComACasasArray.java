package Algoritmos;

import java.util.Iterator;
import java.util.LinkedList;

public class AndarComACasasArray {

	public static void main(String[] args) {
		
		int[] array = new int[20] ;
		int avanco = 10;
		
		array[0] = 41;
		array[1] = 73;
		array[2] = 89;
		array[3] = 7;
		array[4] = 10;
		array[5] = 1;
		array[6] = 59;
		array[7] = 58;
		array[8] = 84;
		array[9] = 77;
		array[10] = 77;
		array[11] = 97;
		array[12] = 58;
		array[13] = 1;
		array[14] = 86;
		array[15] = 58;
		array[16] = 26;
		array[17] = 10;
		array[18] = 86;
		array[19] = 51;
		
		int aux = 0;
		
		LinkedList<Integer> lista = new LinkedList<>();
		
		for (Integer inteiro : array) {
			lista.add(inteiro);
		}
		
		for (int i = 1; i <= avanco; i++) {
			aux = lista.removeFirst();
			lista.offerLast(aux);
		}
		
		
		for (Integer integer : lista) {
			System.out.print(integer + " ");
		}
		
		Integer[] arrayReferencia = lista.toArray(new Integer[lista.size()]);
		
		for (int i = 0; i < arrayReferencia.length; i++) {
			array[i] = arrayReferencia[i];
		}
		System.out.println(" ");
		
		for (Integer integer : array) {
			System.out.print(integer + " ");
		}
		
	}
	
	

}
