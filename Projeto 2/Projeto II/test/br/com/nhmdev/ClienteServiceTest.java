package br.com.nhmdev;

import br.com.nhmdev.domain.Cliente;
import br.com.nhmdev.mock.ClienteDAOMock;
import br.com.nhmdev.exceptions.TipoChaveNaoEncontradaException;
import br.com.nhmdev.dao.IClienteDAO;
import br.com.nhmdev.services.IClienteService;
import br.com.nhmdev.services.ClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {
	private final IClienteService clienteService;
	private Cliente cliente;

    public ClienteServiceTest() {
		IClienteDAO clienteDAOMock = new ClienteDAOMock();
        clienteService = new ClienteService(clienteDAOMock);
    }
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setNome("Thiago");
		cliente.setCpf(12312312312L);
		cliente.setId(17263L);
		cliente.setCidade("Mogi das Cruzes");
		cliente.setEstado("São Paulo");
		cliente.setTelefone(1111111111);
		cliente.setEndereco("Narciso Yague");
		cliente.setNumero(123);
		clienteService.cadastrar(cliente);
	}
	@Test
	public void pesquisarCliente(){
		Cliente clienteEncontrado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteEncontrado);
	}

	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}

	@Test
	public void excluirCliente(){
		clienteService.excluir(cliente.getId());
	}

	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Thiago Alterado");
		clienteService.alterar(cliente);

		Assert.assertEquals("Thiago Alterado", cliente.getNome());
	}
}

