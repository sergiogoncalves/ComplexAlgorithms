package Algoritmos;

public class AliceBob {

	public AliceBob() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a0 = 5;
        int a1 = 6;
        int a2 = 7;
        int b0 = 3;
        int b1 = 6;
        int b2 = 10;
        
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        
        for (int i = 0; i < result.length; i++) {
        	
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            
        }

	}
	
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int alice = 0;
        int bob = 0;
        int[] retorno = new int[2]; 
        
        if (a0 != b0)
        {
            if(a0 > b0){
                alice++;
            }
            else{
               bob++; 
            }
        }
        
        if (a1 != b1)
        {
            if(a1 > b1){
                alice++;
            }
            else{
               bob++; 
            }
        }
        
        if (a2 != b2)
        {
            if(a2 > b2){
                alice++;
            }
            else{
               bob++; 
            }
        }
        
        retorno[0] = alice;
        retorno[0] = bob;

        return retorno;
    }

}
