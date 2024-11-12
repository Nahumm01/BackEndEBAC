package br.com.nhmdev.interfaces;

import br.com.nhmdev.domain.Cliente;

public interface IClienteDAO {
	void salvar(Cliente cliente);
	void excluir(Long cpf);
	Cliente alterar(Cliente cliente);
	Cliente pesquisarPorCpf(String cpf);
}
