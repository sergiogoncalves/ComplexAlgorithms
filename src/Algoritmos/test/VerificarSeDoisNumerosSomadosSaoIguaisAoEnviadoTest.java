package Algoritmos.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Algoritmos.VerificarSeDoisNumerosSomadosSaoIguaisAoEnviado;

public class VerificarSeDoisNumerosSomadosSaoIguaisAoEnviadoTest {

	@Test
	public void testFalse() {
		VerificarSeDoisNumerosSomadosSaoIguaisAoEnviado ver = new VerificarSeDoisNumerosSomadosSaoIguaisAoEnviado();
		
		int[] a = new int[4]; 
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 9;
		
		Assert.assertEquals(false, ver.verificaSoma(a, 8));
	}
	
	@Test
	public void testTrue() {
		VerificarSeDoisNumerosSomadosSaoIguaisAoEnviado ver = new VerificarSeDoisNumerosSomadosSaoIguaisAoEnviado();
		
		int[] a = new int[4]; 
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 4;
		a[3] = 4;
		
		Assert.assertEquals(true, ver.verificaSoma(a, 8));
	}
	
	@Test
	public void testTrue2() {
		VerificarSeDoisNumerosSomadosSaoIguaisAoEnviado ver = new VerificarSeDoisNumerosSomadosSaoIguaisAoEnviado();
		
		int[] a = new int[5]; 
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 4;
		a[3] = 4;
		a[4] = 5;
		
		Assert.assertEquals(true, ver.verificaSoma(a, 9));
	}

}
