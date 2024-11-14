package br.com.nhmdev.services;

import br.com.nhmdev.domain.Cliente;

import br.com.nhmdev.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {
	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
