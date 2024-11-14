package br.com.nhmdev.dao;

import br.com.nhmdev.dao.generic.GenericDAO;
import br.com.nhmdev.domain.Venda;
import br.com.nhmdev.exceptions.TipoChaveNaoEncontradaException;

public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO  {
	@Override
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
		venda.setStatus(Venda.Status.CONCLUIDA);
		super.alterar(venda);
	}

	@Override
	public Class<Venda> getTipoClasse() {
		return Venda.class;
	}

	@Override
	public void excluir(String valor) {
		throw new UnsupportedOperationException("Operação não permitida");
	}

	@Override
	public void atualizarDados(Venda entity, Venda entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setStatus(entity.getStatus());
	}
}
