package br.com.db1.test;

import org.junit.Assert;

import org.junit.Test;

import br.com.db1.ExerciciosDatas;

public class ExerciciosDatasTest {

	private ExerciciosDatas exerciciosDatas = new ExerciciosDatas();

	@Test
	public void bisextoTest() {
		Assert.assertTrue(exerciciosDatas.anoBisexto(2016).equals(true));
	}
}
