package br.com.nhmdev.services;

import br.com.nhmdev.domain.Cliente;
import br.com.nhmdev.interfaces.IClienteDAO;
import br.com.nhmdev.interfaces.IClienteService;

public class ClienteService implements IClienteService {
	IClienteDAO clienteDAO;

	public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

	@Override
	public Boolean salvar(Cliente cliente) {
		clienteDAO.salvar(cliente);
        return true;
    }

	@Override
	public void excluir(Integer id) {
	    clienteDAO.excluir(id);
	}

	@Override
	public Cliente alterar(Cliente cliente) {
		return clienteDAO.alterar(cliente);
	}

	@Override
	public Cliente pesquisarPorCpf(String cpf) {
		return clienteDAO.pesquisarPorCpf(cpf);
	};
}
