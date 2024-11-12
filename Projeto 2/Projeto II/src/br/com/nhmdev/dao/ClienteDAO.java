package br.com.nhmdev.dao;

import br.com.nhmdev.domain.Cliente;
import br.com.nhmdev.interfaces.IClienteDAO;

public class ClienteDAO implements IClienteDAO {

	@Override
	public void salvar(Cliente cliente) {

	}

	@Override
	public void excluir(Long cpf) {

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
