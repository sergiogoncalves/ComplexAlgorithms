package Algoritmos.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Algoritmos.EncontrarANaoRepetida;

public class EncontrarANaoRepetidaTest {

	@Test
	public void test() {
		
		EncontrarANaoRepetida encontrarANaoRepetida = new EncontrarANaoRepetida();
		
		char result; 
		
		String teste = "abacabad";
		
		result = encontrarANaoRepetida.buscarNaoRepetida(teste);
		
		Assert.assertEquals('c', result);
	}
	
	@Test
	public void testMaior() {
		
		EncontrarANaoRepetida encontrarANaoRepetida = new EncontrarANaoRepetida();
		
		char result; 
		
		String teste = "abacabaabacaba";
		
		result = encontrarANaoRepetida.buscarNaoRepetida(teste);
		
		Assert.assertEquals('_', result);
		
	}
	
	@Test
	public void testMaior2() {
		
		EncontrarANaoRepetida encontrarANaoRepetida = new EncontrarANaoRepetida();
		
		char result; 
		
		String teste = "bcccccccb";
		
		result = encontrarANaoRepetida.buscarNaoRepetida(teste);
		
		Assert.assertEquals('_', result);
	}
	
	@Test
	public void test10() {
		
		EncontrarANaoRepetida encontrarANaoRepetida = new EncontrarANaoRepetida();
		
		char result; 
		
		String teste = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
		
		result = encontrarANaoRepetida.buscarNaoRepetida(teste);
		
		Assert.assertEquals('g', result);
	}



}
