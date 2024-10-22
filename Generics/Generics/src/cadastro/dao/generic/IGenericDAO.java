package cadastro.dao.generic;

import cadastro.domain.Persistente;
import cadastro.domain.Produto;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente>{
	public Boolean cadastrarProduto(T entity);

	public void excluirProduto(Long valor);

	public void alterarProduto(T entity);

	public Produto consultarProduto (Long valor);

	public Collection<T> listarTodosProdutos();
}
