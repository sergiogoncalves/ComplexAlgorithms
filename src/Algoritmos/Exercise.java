package Algoritmos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Coding exercise:
We wants to implement a new backup system, in which files are stored into data tapes. This new system must follow the following 2 rules:
Never place more than two files on the same tape.
Files cannot be split across multiple tapes.
It's guaranteed that all tapes have the same size and that they will always be able to store the largest file.

Every time this process is executed, we already know the size of each file, and the capacity of the tapes. Having that in mind, we want to design a system that is able to count how many tapes will be required to store the backup in the most efficient way.

The parameter of your function will be a structure that will contain the file sizes and the capacity of the tapes. You must return the minimum amount of tapes required to store the files.
Example:
Input: Tape Size = 100; Files: 70, 10, 20 
Output: 2

*/


public class Exercise {

	public static void main(String[] args) {
		
		 int[] vetor = new int[6]; 
		 
		 vetor[0] = 70;
		 vetor[1] = 10;
		 vetor[2] = 20;
		 vetor[3] = 90;
		 vetor[4] = 80;
		 
		 
		System.out.println(GetMinimumTapeCount(vetor, 100));
	}
		
	public static int GetMinimumTapeCount(int[] files, int tapeCapacity)
        {
            //sort in ascending
           Arrays.sort(files);

            int count = 0;
            int i = 0;
            int j = files.length - 1;


            while (i <= j)
            {
                //if the largest file is less than half of capacity
                if (files[j] <= tapeCapacity / 2)
                {
                    count += (j-i)/ 2 + 1;
                    break;
                }

                if (files[i] + files[j] <= tapeCapacity)
                {
                    i++;
                    j--;
                }
                else
                    j--;

                count++;
            }

            return count;
        }
}



