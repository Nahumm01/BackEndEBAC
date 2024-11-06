package br.com.nhmdev.tests;

import org.junit.Assert;
import org.junit.Test;

public class PrimeirosTest {
	@Test
	public void primeiroTeste() {
		String nome = "Nahum";
		Assert.assertEquals("Nahum", nome);

	}

	@Test
	public void segundoTeste() {
		String nome = "Nahum1";
		Assert.assertNotEquals("Nahum", nome);
	}
}