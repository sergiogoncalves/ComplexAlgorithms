package Algoritmos;

public class MaiorNumeroDesvio {

	public MaiorNumeroDesvio() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] A = new int[4];
		
		        A[0] =  9;
			    A[1] =  4;
			    A[2] = -3;
			    A[3] = -10;
			    
			    int result = -1;
			    
			    int valorMenorZero = 0;
			    int valorMaiorZero = 0;
			    int posicaoMenorZero = -1;
			    int posicaoMaiorZero = -1;
			    
			    
			    if (A.length == 0) {
			    	result = -1;
				}	
			    
			    for (int i = 0; i < A.length; i++) {
					
			    	if(A[i] < 0){
			    		
			    		if (valorMenorZero > A[i]) {
			    			valorMenorZero = A[i];
			    			posicaoMenorZero = i;
						}
			    		
			    	}else{
			    		if (valorMaiorZero < A[i]) {
			    			valorMaiorZero = A[i];
			    			posicaoMaiorZero = i;
						}
			    	}
				}
			    
			    
			    if ((valorMenorZero*-1) > valorMaiorZero) {
			    	result = posicaoMenorZero;
				}
			    else{
			    	result = posicaoMaiorZero;
			    }
			    
			    
			    System.out.println(result);
			    
	}

}
