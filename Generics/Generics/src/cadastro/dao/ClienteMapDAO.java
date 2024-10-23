package cadastro.dao;

import cadastro.dao.generic.GenericDAO;
import cadastro.domain.Cliente;


public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO{

	public ClienteMapDAO(){
		super();
	}

	@Override
	public Class<Cliente> getTipoClass() {
		return Cliente.class;
	}
}
