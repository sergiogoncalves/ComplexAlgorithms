package Algoritmos.TestesComJava;

import static org.junit.Assert.*;

import org.junit.Test;

import Algoritmos.FindLastArray;

public class FindLastArrayTest {

	@Test
	public void shouldReturn2() {
		int[] array01 = {4,9,3,7,8};
		int[] array02 = {3,7};
		
		assertEquals(2, FindLastArray.findLastArray(array01, array02));
	}
	
	@Test
	public void shouldReturn0() {
		int[] array01 = {1,3,5};
		int[] array02 = {1};
		
		assertEquals(0, FindLastArray.findLastArray(array01, array02));
	}
	
	@Test
	public void shouldReturnMinus1() {
		int[] array01 = {7,8,9};
		int[] array02 = {8,9,10};
		
		assertEquals(-1, FindLastArray.findLastArray(array01, array02));
	}
	
	@Test
	public void shouldReturn5() {
		int[] array01 = {4,9,3,7,8,3,7,1};
		int[] array02 = {3,7};
		
		assertEquals(5, FindLastArray.findLastArray(array01, array02));
	}

}
