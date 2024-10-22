package cadastro.dao;

import cadastro.dao.generic.IGenericDAO;
import cadastro.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO extends IGenericDAO<Cliente> {

	 boolean inserirCliente(Cliente cliente);

	 void alterarCliente(Cliente cliente);

	 boolean excluirCliente(Long cpf);

	 Cliente buscarCliente(Long cpf);

	 Collection<Cliente> listarCliente();

}
