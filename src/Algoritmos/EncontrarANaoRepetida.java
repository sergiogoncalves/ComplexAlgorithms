package Algoritmos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class EncontrarANaoRepetida {

	public EncontrarANaoRepetida(){
		
	}
	
	public char buscarNaoRepetida(String s){
		
		char retorno = '_';
		String valorFinal;
				
	
		LinkedHashSet<String> naoRepetidas = new LinkedHashSet();
		Set<String> utilizadas = new HashSet();
	
		
		for (int i = 0; i < s.length(); i++) {
			String letra = String.valueOf(s.charAt(i));
			
			if (!naoRepetidas.contains(letra)) {
				
				if (!utilizadas.contains(letra)) {
					naoRepetidas.add(letra);
				}
			}
			else{
				utilizadas.add(letra);
				naoRepetidas.remove(letra);
				
			}
		}
		
		
		for (String string : naoRepetidas) {
			retorno = string.charAt(0);
			break;
		}
		
		return retorno;
	}

}
