package br.com.nhmdev;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {
	@Test
	public void testeClasseCliente() {
		TesteCliente cliente = new TesteCliente();
		cliente.setNome("Nahum");

		Assert.assertEquals("Nahum", cliente.getNome());

		cliente.addNome("Moura");

		Assert.assertEquals("Moura", cliente.getNome());
	}
}
