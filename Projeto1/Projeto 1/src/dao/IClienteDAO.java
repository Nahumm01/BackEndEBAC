package dao;

import br.com.nhmdev.domain.Cliente;

import java.util.Collection;

public interface IClienteDAO {

	public boolean inserirCliente(Cliente cliente);

	public void alterarCliente(Cliente cliente);

	public boolean excluirCliente(Long cpf);

	public Cliente buscarCliente(Long cpf);

	public Collection<Cliente> listarCliente();
}
