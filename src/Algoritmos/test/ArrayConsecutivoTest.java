package Algoritmos.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Algoritmos.ArrayConsecutivo;

public class ArrayConsecutivoTest {

	@Test
	public void test() {
		int[] statues = new int[4];
		
		statues[0] = 0;
		statues[1] = 3;
		//statues[2] = 3;
		//statues[3] = 8;
		
		ArrayConsecutivo ac = new ArrayConsecutivo();
		
		int resultado = ac.consecutive(statues);
		
		Assert.assertEquals(2, resultado);
	}

}
