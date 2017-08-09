//Este teste verifica o primeiro item repetido na lista e o retorna.

//Situação
//Melhorar a performance

package Algoritmos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EncontrarRepetidosArray {

	public static void main(String[] args) {
		
		try {
			
			int[] a = new int[10];
			
			List<Integer> adicionados = new ArrayList<>();

			a[0] = 8;
			a[1] = 4;
			a[2] = 6;
			a[3] = 2;
			a[4] = 6;
			a[5] = 4;
			a[6] = 7;
			a[7] = 9;
			a[8] = 5;
			a[9] = 8;
			
			int valorFinal = -1;
			
			 
		  	Set<Integer> numbers = new HashSet<Integer>();
			
			numbers.add(a[0]); 
			
			for (int i = 1; i < a.length; i++) {
				if (numbers.contains(a[i])) {
					valorFinal = a[i];
					break;
				}
				
				numbers.add(a[i]); 
			}
			
		
		    
		    
		    System.out.println("Valor : " + valorFinal );
			
		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}

	    

	    

	}

}
