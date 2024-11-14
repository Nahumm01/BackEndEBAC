package br.com.nhmdev.dao;

import br.com.nhmdev.dao.generic.GenericDAO;
import br.com.nhmdev.domain.Produto;

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO  {
	public ProdutoDAO() {
		super();
	}

	@Override
	public Class<Produto> getTipoClasse() {
		return Produto.class;
	}

	@Override
	public void atualizarDados(Produto entity, Produto entityCadastrado) {
		entityCadastrado.setCodigo(entity.getCodigo());
		entityCadastrado.setDescricao(entity.getDescricao());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setValor(entity.getValor());
	}
}
