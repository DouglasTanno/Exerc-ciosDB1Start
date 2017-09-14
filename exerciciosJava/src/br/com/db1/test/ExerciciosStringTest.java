package br.com.db1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.ExerciciosString;

public class ExerciciosStringTest {

	private ExerciciosString exerciciosString = new ExerciciosString();

	@Before
	public void before() {
		System.out.println("Rodou 1 teste");
	}

	@After
	public void after() {
		System.out.println("Resultado: " + exerciciosString.exibirResposta());
		System.out.println("Finalizou 1 teste");
	}

	@Test
	public void maiusculoTest() {
		Assert.assertTrue(exerciciosString.maiusculo("teste string").equals("TESTE STRING"));
	}

	@Test
	public void minusculoTest() {
		Assert.assertTrue(exerciciosString.minusculo("TESTE STRING").equals("teste string"));
	}

	@Test
	public void contagemTest() {
		Assert.assertTrue(8 == exerciciosString.contagem("DB1START"));
		Assert.assertTrue(10 == exerciciosString.contagem(" DB1START "));
	}

	@Test
	public void cont1Test() {
		Assert.assertTrue(8 == exerciciosString.cont1(" DB1START "));
	}

	@Test
	public void nomeTest() {
		Assert.assertTrue(exerciciosString.nome("DOUGLAS RORIE TANNO").equals("DOUG"));
	}

	@Test
	public void nome1Test() {
		Assert.assertTrue(exerciciosString.nome1("DOUGLAS RORIE TANNO").equals("GLAS RORIE TANNO"));
	}

	@Test
	public void nome2Test() {
		Assert.assertTrue(exerciciosString.nome2("DOUGLAS RORIE TANNO").equals("ANNO"));
	}

	@Test
	public void trocarNomeTest() {
		Assert.assertTrue(exerciciosString.trocarNome("DOUGLAS RORIE TANNO").equals("ALUNO RORIE TANNO"));
	}

	@Test
	public void frutasTest() {
		Assert.assertTrue(exerciciosString.frutas("banana, maca, melancia").equals("banana maca melancia"));
	}

	@Test
	public void contarVogaisTest() {
		Assert.assertTrue(3 == exerciciosString.contarVogais("DOUGLAS"));
	}

	@Test
	public void reversoTest() {
		Assert.assertTrue(exerciciosString.reverso("DOUGLAS").equals("SALGUOD"));
	}
}
