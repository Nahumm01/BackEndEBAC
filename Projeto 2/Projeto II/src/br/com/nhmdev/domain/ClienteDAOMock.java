package br.com.nhmdev.domain;

import br.com.nhmdev.exceptions.TipoChaveNaoEncontradaException;
import br.com.nhmdev.interfaces.IClienteDAO;

import java.util.Collection;
import java.util.List;

public class ClienteDAOMock implements IClienteDAO {

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		return true;
	}

	@Override
	public Boolean excluir(Long valor) {

		return true;
	}

	@Override
	public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cliente = new Cliente();
		cliente.setCpf(valor);
		return cliente;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		return List.of();
	}
}
