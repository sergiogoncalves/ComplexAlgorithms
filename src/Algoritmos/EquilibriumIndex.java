package Algoritmos;

public class EquilibriumIndex {
	
	public EquilibriumIndex(){
		
	}

	 public int solution(int[] A) {
		    if (A.length == 0) return -1;

		        int res = 0;

		        long sum1 = 0;

		        long sum2 = 0;

		        for (int i = 1; i < A.length; i++) {

		            sum2 += A[i];
		        }

		        if (sum2 == 0) return res;

		        while ((res < A.length - 1) && (sum1 != sum2)) {

		            res++;

		            sum1 += A[res - 1];

		            if (res < A.length - 1) sum2 -= A[res];

		            else sum2 = 0;

		       }

		        if (sum1 == sum2) return res;
		        else return -1;

		    }
}
