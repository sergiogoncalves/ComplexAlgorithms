package Algoritmos;

import java.util.Arrays;

public class DoisNumerosNegativosSomam10 {

	public DoisNumerosNegativosSomam10() {
		
	}

	public static void main(String[] args) {
		

	}
	
	public static boolean sortedBruteForce(int[] a)
    {
        Arrays.sort(a);                             // Best case sorting is O(n log n)
       
        int index = 0;
        while(a[index] <= 10)                       // This loop is O(n) bc worst case all nums >= 10
        {
            for(int j = index+1; j < a.length; j++) // This loop is O(n)
                if(a[index] + a[j] == 10)
                    return true;                    // This solution is O(n^2) bc we do independent 
            index++;                                // big-o analysis in sequence and then choose worst
        }
        return false;

        /* this solution could claim to optimize the solution because we 'ignore' numbers that
         * are greater than 10; however, because we sort the numbers first, this solution is
         * actually worse, unless we were guaranteed the numbers were already in order,
         * and even then, the gain is negligible
         */
    }

}
