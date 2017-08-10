package Algoritmos;

import java.util.Arrays;

public class ArrayConsecutivo {

	public ArrayConsecutivo() {
		// TODO Auto-generated constructor stub
	}
	
	public int consecutive(int[] statues){

		
		if (statues.length <= 1) {
			return 0;
		}
		
		int retorno = 0;
		
		Arrays.sort(statues);
		
		for (int i = 0; i < statues.length - 1; i++) {
			if ((statues[i+1] - statues[i]) > 1) {
				
				if (statues[i] == 0) {
					retorno += (statues[i+1] - 1);
				}else{
					retorno += (statues[i+1] - statues[i]) - 1;
				}
			}
		}

		return retorno;
	}
}
