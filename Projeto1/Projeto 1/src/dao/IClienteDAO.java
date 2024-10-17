package dao;

import br.com.nhmdev.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

	 boolean inserirCliente(Cliente cliente);

	 void alterarCliente(Cliente cliente);

	 boolean excluirCliente(Long cpf);

	 Cliente buscarCliente(Long cpf);

	 Collection<Cliente> listarCliente();

}
