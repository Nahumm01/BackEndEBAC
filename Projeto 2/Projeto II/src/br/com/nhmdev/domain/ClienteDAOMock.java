package br.com.nhmdev.domain;

import br.com.nhmdev.interfaces.IClienteDAO;

public class ClienteDAOMock implements IClienteDAO {
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
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		return cliente;
	}
}
