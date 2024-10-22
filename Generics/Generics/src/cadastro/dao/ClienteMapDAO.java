package cadastro.dao;

import cadastro.dao.generic.GenericDAO;
import cadastro.domain.Cliente;


public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO{

	public ClienteMapDAO(){
		super();
	}
/*	private Map<Long, Cliente> map;

	public ClienteMapDAO() {
		map = new HashMap<Long, Cliente>();
	}

	@Override
	public boolean inserirCliente(Cliente cliente) {
		if (this.map.containsKey(cliente.getCpf())){
			return false;
		}
		this.map.put(cliente.getCpf(), cliente);
		return true;
	}

	@Override
	public void alterarCliente(Cliente cliente) {
		Cliente clienteAux = this.map.get(cliente.getCpf());
		if (clienteAux != null) {
			clienteAux.setNome(cliente.getNome());
			clienteAux.setCpf(cliente.getCpf());
			clienteAux.setCidade(cliente.getCidade());
			clienteAux.setEstado(cliente.getEstado());
			clienteAux.setTelefone(cliente.getTelefone());
			clienteAux.setEndereco(cliente.getEndereco());
		}
	}

	@Override
	public boolean excluirCliente(Long cpf) {
		Cliente cliente = this.map.get(cpf);
		if (cliente != null) {
			this.map.remove(cliente.getCpf(), cliente);
		}
		return true;
	}

	@Override
	public Cliente buscarCliente(Long cpf) {
		return this.map.get(cpf);
	}

	@Override
	public Collection<Cliente> listarCliente() {
		return this.map.values();
	}*/
}
