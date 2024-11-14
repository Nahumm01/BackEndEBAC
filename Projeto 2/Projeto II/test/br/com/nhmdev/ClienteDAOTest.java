package br.com.nhmdev;

import br.com.nhmdev.domain.Cliente;
import br.com.nhmdev.mock.ClienteDAOMock;
import br.com.nhmdev.exceptions.TipoChaveNaoEncontradaException;
import br.com.nhmdev.dao.IClienteDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {
	private final IClienteDAO clienteDAO;
	private Cliente cliente;

	public ClienteDAOTest() {
		clienteDAO = new ClienteDAOMock();
	}

	@Before
	public void setUp(){
		cliente = new Cliente();
		cliente.setNome("Thiago");
		cliente.setCpf(12312312312L);
		cliente.setId(17263L);
		cliente.setCidade("Mogi das Cruzes");
		cliente.setEstado("São Paulo");
		cliente.setTelefone(1111111111);
		cliente.setEndereco("Narciso Yague");
		cliente.setNumero(123);
    }

	@Test
	public void pesquisarCliente(){
	    Cliente clienteEncontrado = clienteDAO.consultar(cliente.getCpf());
		System.out.println("Cliente encontrado: " + clienteEncontrado);
		Assert.assertNotNull(clienteEncontrado);
	}

	@Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteDAO.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}

	@Test
    public void excluirCliente(){
		clienteDAO.excluir(cliente.getId());
    }

	@Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Thiago Alterado");
		clienteDAO.alterar(cliente);

		Assert.assertEquals("Thiago Alterado", cliente.getNome());
	}
}
