package br.com.nhmdev;

import br.com.nhmdev.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {
	@Test
	public void salvarTest() {
	    ClienteService service = new ClienteService();
		String retorno = service.salvar();
		Assert.assertEquals("Cliente salvo com sucesso!", retorno);
	}
}