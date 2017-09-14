package br.com.db1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.ExerciciosDouble;

public class ExerciciosDoubleTest {

	private ExerciciosDouble exerciciosDouble = new ExerciciosDouble(); 
	
	@Test
	public void menorTest() {
		exerciciosDouble.menor(2d,5d);
		Assert.assertTrue(2d == exerciciosDouble.exibirResultado());
	}
	
	@Test
	public void menorTriTest() {
		exerciciosDouble.menorTri(100d, 500d, 120d);
		Assert.assertTrue(100d == exerciciosDouble.exibirResultado());
	}
	
	@Test
	public void mediaTest() {
		exerciciosDouble.media(100d, 500d, 120d);
		Assert.assertTrue(240d == exerciciosDouble.exibirResultado());
	}
	
	@Test
	public void areaTrianguloTest() {
		exerciciosDouble.areaTriangulo(10d, 5d);
		Assert.assertTrue(25d == exerciciosDouble.exibirResultado());
	}
	
}
