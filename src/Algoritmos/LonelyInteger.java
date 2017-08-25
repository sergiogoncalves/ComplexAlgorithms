package Algoritmos;

import java.util.HashSet;
import java.util.Set;

public class LonelyInteger {
	
	// Given A, find and print the unique element.



	public static void main(String[] args) {
		 int a[] = new int[3];
		 
		 a[0] = 1;
    	 a[1] = 1;
		 a[2] = 2;
		 
		 System.out.println(lonelyInteger(a));
	}
	
    public static int lonelyInteger(int[] a) {
        
        Set<Integer> b = new HashSet<Integer>();
        
        for(int i=0; i < a.length; i++){
            if(!b.contains(a[i])){
                b.add(a[i]);
            }
            else {
                 b.remove(a[i]);
            }
        }
        for (Integer retorno : b) {
		
        	return retorno;
		}
        
        return 0;
    }

}
