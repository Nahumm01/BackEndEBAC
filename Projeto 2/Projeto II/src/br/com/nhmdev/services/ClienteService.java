package br.com.nhmdev.services;

import br.com.nhmdev.domain.Cliente;
import br.com.nhmdev.exceptions.TipoChaveNaoEncontradaException;
import br.com.nhmdev.dao.IClienteDAO;

import java.util.Collection;
import java.util.List;

public class ClienteService implements IClienteService {
	IClienteDAO clienteDAO;

	public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }


    @Override
    public Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return clienteDAO.cadastrar(cliente);
    }

    @Override
    public Boolean excluir(Long cpf) {
        return clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        clienteDAO.alterar(cliente);
    }

    @Override
    public Cliente consultar(Long cpf) {
         return clienteDAO.consultar(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return List.of();
    }
}
