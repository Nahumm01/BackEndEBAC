package br.com.nhmdev.services;

import br.com.nhmdev.dao.IProdutoDAO;

import br.com.nhmdev.domain.Produto;
import br.com.nhmdev.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto,String> implements IProdutoService {
	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}
}
