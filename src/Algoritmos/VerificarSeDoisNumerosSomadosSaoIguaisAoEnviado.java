package Algoritmos;

import java.util.HashSet;
import java.util.Set;

public class VerificarSeDoisNumerosSomadosSaoIguaisAoEnviado {
	
	public boolean verificaSoma(int[] a, int esperado){
		
		Set<Integer> unique = new HashSet<Integer>();
		
		for (int valor : a) {
			
			if(unique.contains(valor)){
				return true;
			}
			else{
				unique.add(esperado - valor);
			}
		}
	
		return false;
	}

}
