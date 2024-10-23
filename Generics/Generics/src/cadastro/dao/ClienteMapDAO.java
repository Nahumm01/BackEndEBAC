package cadastro.dao;

import cadastro.dao.generic.GenericDAO;
import cadastro.domain.Cliente;

import java.util.HashMap;
import java.util.Map;


public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO{

	public ClienteMapDAO(){
		super();

	}

	@Override
	public Class<Cliente> getTipoClass() {
		return Cliente.class;
	}
}
