package br.com.nhmdev.interfaces;

import br.com.nhmdev.domain.Cliente;

public interface IClienteDAO {
	Boolean salvar(Cliente cliente);
	Boolean excluir(Integer id);
	Cliente alterar(Cliente cliente);
	Cliente pesquisarPorCpf(String cpf);
}
