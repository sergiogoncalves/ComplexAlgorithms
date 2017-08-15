package Algoritmos;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrimeiraStringRepetida {

	public static void main(String[] args) {
		
		int[] a = new int[6];

		a[0] = 2;
		a[1] = 3;
		a[2] = 3;
		a[3] = 1;
		a[4] = 5;
		a[5] = 2;
		

		System.out.println(new PrimeiraStringRepetida().buscarUltimaRepetida(a));
		//System.out.println(new PrimeiraStringRepetida().buscaRepetida(a));

	}
	
	public int buscarUltimaRepetida2(int[] a){
		int bitarray = 0;
		
	    for(int i: a) {
	        if ((bitarray & (1 << (i-1))) == (1 << (i-1))) return i;
	        bitarray |= (1 << (i-1));
	    }
	    return -1;
	}
	
	public int buscarUltimaRepetida3(int[] a){
		
		int codigoAtual;
		int itemRepetido;
		int ultimaPosicao;
		boolean adicionar = true;
		boolean mudou = false;

		int retorno = -1;

		List<Integer> adicionados = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			codigoAtual = a[i];
			ultimaPosicao = 0;

			if (!(i == (a.length - 1))) {
				for (int j = i + 1; j <= a.length - 1; j++) {
					if (codigoAtual == a[j]) {
						ultimaPosicao = j;

						for (Integer tem : adicionados) {
							if (tem == codigoAtual) {
								adicionar = false;
							}
						}
						

						break;

					}
				}
			}

			if (ultimaPosicao != 0) {
				if (adicionar) {

					if (!mudou) {
						mudou = true;
						retorno = ultimaPosicao;
						continue;
					}else{
						
						if (retorno > ultimaPosicao) {
							retorno = ultimaPosicao;
						}
					}

					mudou = true;

					adicionados.add(codigoAtual);
				}
			}
		}
		if(retorno >= 0){
			return a[retorno];
		}
		else{
			return -1;
		}
		
		
	}

	public int buscarUltimaRepetida(int[] a){
		Set<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(a[0]); 
		
		for (int i = 1; i < a.length; i++) {
			if (numbers.contains(a[i])) {
				return a[i];
			}
			
			numbers.add(a[i]); 
		}
		
		return -1;
	}
}
