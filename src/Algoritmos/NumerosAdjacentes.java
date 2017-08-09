package Algoritmos;

import java.util.ArrayList;
import java.util.List;

public class NumerosAdjacentes {

	public static void main(String[] args) {
	
		int[] inputArray = new int[5];
		int valorMaximo = 0;
		
		inputArray[0] = -23;
		inputArray[1] = 4;
		inputArray[2] = -3;
		inputArray[3] = 8;
		inputArray[4] = -12;
		
		
		for (int i = 0; i < (inputArray.length - 1); i++) {
			
			if(i == 0)
			{
				valorMaximo = inputArray[i] * inputArray[i + 1];
			}
			
			
			if((inputArray[i] * inputArray[i + 1]) > valorMaximo)
			{
				valorMaximo = inputArray[i] * inputArray[i + 1];
			}
		}

		System.out.println(valorMaximo);
	}

}
