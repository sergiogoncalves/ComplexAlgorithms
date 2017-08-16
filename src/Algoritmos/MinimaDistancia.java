package Algoritmos;



public class MinimaDistancia {

	public MinimaDistancia() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	 
		int[] A = new int[6];
		          A[0] = 8;
				  A[1] = 24;
				  A[2] = 3;
				  A[3] = 20;
				  A[4] = 1;
				  A[5] = 17;
				  
				  
				  java.util.Arrays.sort(A);
				  
				  int valorMinimo = 0;
				  
				  valorMinimo = A[1] - A[0];
				  
				  for (int i = 0; i < A.length - 1; i++) {
					
					  if((A[i + 1] - A[i]) < valorMinimo) {
						  valorMinimo = A[i + 1] - A[i + 1];
					  }
				  }
				  
				  System.out.println(valorMinimo);

	}

}
