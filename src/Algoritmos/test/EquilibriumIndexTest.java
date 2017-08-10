package Algoritmos.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Algoritmos.EquilibriumIndex;

public class EquilibriumIndexTest {

	@Test
	public void test() {
		int[] A = new int[8];
		int result;
		
		  A[0] = -1;
		  A[1] =  3;
		  A[2] = -4;
		  A[3] =  5;
		  A[4] =  1;
		  A[5] = -6;
		  A[6] =  2;
		  A[7] =  1;
		  
		  EquilibriumIndex equilibriumIndex = new EquilibriumIndex();
		  
		  result = equilibriumIndex.solution(A);
		  
		  Assert.assertEquals(1, result);
		  
	}

}
