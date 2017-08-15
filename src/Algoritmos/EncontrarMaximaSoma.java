package Algoritmos;



public class EncontrarMaximaSoma {

	public EncontrarMaximaSoma() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int[] A = new int[3];
		A[0] =  1;
		A[1] =  3;
		A[2] = -3;
		
		
		//java.util.Map<Integer, Integer> rotas = new java.util.HashMap<Integer, Integer>();
		
		/*valorAtual = A[i];
		
		if(){
			maiorValor = 
		}*/
				  
		int maiorValor = 0;
		int valorAtual = 0;
		
	
		for (int i = 0; i < A.length; i++) {

			
			for (int j = 0; j < A.length; j++) {

				
				valorAtual = A[i] + A[j] +(j - i);
				if (maiorValor < valorAtual) {
					maiorValor = valorAtual;
				}
				
			}
			
		}
		
		System.out.println(maiorValor);
		
		
		
		
		

	}

}
