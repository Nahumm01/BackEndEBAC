package br.com.nhmdev.dao;

import br.com.nhmdev.domain.Cliente;
import br.com.nhmdev.generics.GenericDAO;
import br.com.nhmdev.interfaces.IClienteDAO;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {


	@Override
	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	@Override
	public void atualizarDados(Cliente entity, Cliente entityCadastrado) {

	}
}
