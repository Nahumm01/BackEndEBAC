package br.com.nhmdev.services;

import br.com.nhmdev.domain.Cliente;
import br.com.nhmdev.dao.IClienteDAO;
import br.com.nhmdev.services.generic.GenericService;


public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }
}
