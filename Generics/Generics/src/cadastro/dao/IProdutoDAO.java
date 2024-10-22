package cadastro.dao;

import cadastro.domain.Produto;

import java.util.Collection;

public interface IProdutoDAO {
	public Boolean cadastrarProduto(Produto produto);

	public void excluirProduto(Long codigo);

	public void alterarProduto(Produto produto);

	public Produto consultarProduto (Long codigo);

	public Collection<Produto> listarTodosProdutos();
}
