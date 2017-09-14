package br.com.db1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.ExerciciosInteger;

public class ExerciciosIntegerTest {

	private ExerciciosInteger exerciciosInteger = new ExerciciosInteger(); 
	
	
	@Before
	public void before(){
		System.out.println("Rodou 1 teste");
	}
	
	@After
	public void after(){
		System.out.println("Resultado: " + exerciciosInteger.exibirResultado());
		System.out.println("Finalizou 1 teste");
	}
	
	@Test
	public void somarTest() {
		exerciciosInteger.somar(1, 10);
		Assert.assertTrue(11 == exerciciosInteger.exibirResultado());
	}	
	
	@Test
	public void subtrairTest() {
		exerciciosInteger.subtrair(100, 10);
		Assert.assertTrue(90 == exerciciosInteger.exibirResultado());
	}

	@Test
	public void multiplicarTest() {
		exerciciosInteger.multiplicar(100, 10);
		Assert.assertTrue(1000 == exerciciosInteger.exibirResultado());
	}
	
	@Test
	public void dividirTest() {
		exerciciosInteger.dividir(100, 10);
		Assert.assertTrue(10 == exerciciosInteger.exibirResultado());
	}
	
	@Test
	public void parTest() {
		exerciciosInteger.par(100);
		Assert.assertTrue(0 == exerciciosInteger.exibirResultado());
	}
	
	@Test
	public void maiorTest() {
		exerciciosInteger.maior(10, 9);
		Assert.assertTrue(10 == exerciciosInteger.exibirResultado());
	}

	@Test
	public void numerosImparesTest(){
		Assert.assertTrue(exerciciosInteger.numerosImpares(90) == 5);
	}
}