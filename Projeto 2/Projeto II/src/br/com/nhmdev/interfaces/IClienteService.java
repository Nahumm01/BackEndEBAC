package br.com.nhmdev.interfaces;

import br.com.nhmdev.domain.Cliente;

public interface IClienteService {
	Boolean salvar(Cliente cliente);
	void excluir(Integer id);
	Cliente alterar(Cliente cliente);
	Cliente pesquisarPorCpf(String cpf);
}
