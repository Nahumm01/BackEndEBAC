package br.com.nhmdev.dao;

import br.com.nhmdev.domain.Cliente;
import br.com.nhmdev.interfaces.IClienteDAO;

public class ClienteDAO implements IClienteDAO {

	@Override
	public Boolean salvar(Cliente cliente) {
		return true;
	}

	@Override
	public Boolean excluir(Integer id) {
	    return true;
	}

	@Override
	public Cliente alterar(Cliente cliente) {
		return null;
	}

	@Override
	public Cliente pesquisarPorCpf(String cpf) {
		return null;
	}
}
