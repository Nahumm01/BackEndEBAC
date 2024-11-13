package br.com.nhmdev;

import br.com.nhmdev.domain.Cliente;
import br.com.nhmdev.domain.ClienteDAOMock;
import br.com.nhmdev.interfaces.IClienteDAO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {
	private IClienteDAO clienteDAO;
	private Cliente cliente;

	public ClienteDAOTest() {
		clienteDAO = new ClienteDAOMock();
	}

	@Before
	public void setUp(){
		cliente = new Cliente();
		cliente.setNome("Thiago");
		cliente.setCpf("123-123-123-12");
		cliente.setId(17263);
		cliente.setCidade("Mogi das Cruzes");
		cliente.setEstado("São Paulo");
		cliente.setTelefone(1111111111);
		cliente.setEndereco("Narciso Yague");
		cliente.setNumero(123);

    }

	@Test
	public void pesquisarCliente(){
	    Cliente clienteEncontrado = clienteDAO.pesquisarPorCpf(cliente.getCpf());
		System.out.println("Cliente encontrado: " + clienteEncontrado);
		Assert.assertNotNull(clienteEncontrado);
	}

	@Test
    public void salvarCliente(){
		Boolean retorno = clienteDAO.salvar(cliente);
		Assert.assertTrue(retorno);
	}

	@Test
    public void excluirCliente(){
        Boolean retorno = clienteDAO.excluir(cliente.getId());
        Assert.assertTrue(retorno);
    }
}
