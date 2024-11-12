package br.com.nhmdev;

import br.com.nhmdev.domain.Cliente;
import br.com.nhmdev.domain.ClienteDAOMock;
import br.com.nhmdev.interfaces.IClienteDAO;
import br.com.nhmdev.interfaces.IClienteService;
import br.com.nhmdev.services.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {
	private final IClienteService clienteService;

    public ClienteTest() {
		IClienteDAO clienteDAOMock = new ClienteDAOMock();
        clienteService = new ClienteService(clienteDAOMock);
    }

	@Test
	public void pesquisarCliente() {
		Cliente cliente = new Cliente();
        cliente.setNome("Thiago");
		cliente.setCpf("123-123-123-12");
		cliente.setId(17263);
		cliente.setCidade("Mogi das Cruzes");
		cliente.setEstado("São Paulo");
		cliente.setTelefone(1111111111);
		cliente.setEndereco("Narciso Yague");
		cliente.setNumero(123);

		clienteService.salvar(cliente);

		Cliente clienteEncontrado = clienteService.pesquisarPorCpf(cliente.getCpf());

        System.out.println("Cliente encontrado: " + clienteEncontrado);
		Assert.assertNotNull(clienteEncontrado);
	}
}
