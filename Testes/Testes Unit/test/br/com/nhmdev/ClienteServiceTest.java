package br.com.nhmdev;

import br.com.nhmdev.dao.ClienteDAO;
import br.com.nhmdev.mock.ClienteDAOMock;
import br.com.nhmdev.interfaces.IClienteDAO;
import br.com.nhmdev.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {
	@Test
	public void salvarTestComDAO() {
		IClienteDAO mockService = new ClienteDAOMock();
		ClienteService mkService = new ClienteService(mockService);
		String retornoMk = mkService.salvar();
		Assert.assertEquals("Cliente salvo com sucesso!", retornoMk);

	}

	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoSalvarTest() {
		IClienteDAO clienteDAO = new ClienteDAO();
		ClienteService daoService = new ClienteService(clienteDAO);
		String retornoDao = daoService.salvar();
		Assert.assertEquals("Cliente salvo com sucesso!", retornoDao);
	}
}