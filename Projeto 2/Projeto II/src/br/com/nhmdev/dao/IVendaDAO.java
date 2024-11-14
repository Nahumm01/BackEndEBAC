package br.com.nhmdev.dao;

import br.com.nhmdev.dao.generic.IGenericDAO;
import br.com.nhmdev.domain.Venda;
import br.com.nhmdev.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
