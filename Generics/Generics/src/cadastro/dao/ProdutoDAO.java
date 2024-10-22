package cadastro.dao;

import cadastro.domain.Produto;

import java.util.Collection;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO{
	@Override
	public Boolean cadastrarProduto(Produto produto) {
		return null;
	}

	@Override
	public void excluirProduto(Long codigo) {

	}

	@Override
	public void alterarProduto(Produto produto) {

	}

	@Override
	public Produto consultarProduto(Long codigo) {
		return null;
	}

	@Override
	public Collection<Produto> listarTodosProdutos() {
		return List.of();
	}
}
