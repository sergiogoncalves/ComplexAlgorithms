package Algoritmos;

import java.util.TreeSet;


public class NumeroPertoZero {

	public NumeroPertoZero() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		double[] ts = {7,-10,13,8,4,-7.2,-12,-3.7,3.5,-9.6,6.5,-1.7,-6.2,7,1.8, -1.7, -1.7, 5526, -273, -0.1, 0.1};
		
		double retorno = 0;
		
		if (ts.length > 0) {
			retorno = ts[0];
		}
		
		
		for (int i = 0; i < ts.length; i++) {
			if (Math.abs(ts[i]) < Math.abs(retorno)) {
				retorno = ts[i];
			}
			else if(Math.abs(ts[i]) == Math.abs(retorno)){
				if(ts[i] > 0)
				{
					retorno = Math.abs(ts[i]);
				}
			}
			
		}
		
		System.out.println(retorno);

	
	}

}
